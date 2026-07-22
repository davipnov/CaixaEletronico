package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CaixaEletronico {
    private int notas100;
    private int notas50;
    private int notas20;
    private int notas10;

    public CaixaEletronico() {
    notas100 = 5;
    notas50 = 10;
    notas20 = 10;
    notas10 = 20;
    }

    public void verficarSaldo() {
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);

        int total = notas100 * 100 +
                notas50 * 50 +
                notas20 * 20 +
                notas10 * 10;

        System.out.println("Total em caixa: " + total);
    }

    public void realizarSaque(int valor) {
        if(valor % 10 != 0){
            System.out.println("Valor inválido. O valor deve ser múltiplo de 10.");
            return;
        }
    }

}
