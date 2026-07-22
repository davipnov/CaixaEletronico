package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CaixaEletronico caixa = new CaixaEletronico();

        int opcao;

        do{

            System.out.println("1 - Saldo");
            System.out.println("2 - Saque");
            System.out.println("3 - Sair");

            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    caixa.verficarSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    int valor = sc.nextInt();
                    caixa.realizarSaque(valor);
                    break;

            }while (opcao !=3);
        }

    }
}
