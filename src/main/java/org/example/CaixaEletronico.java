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
        int restante = valor;
        int usar100 = restante / 100;
        usar100 = Math.min(usar100, notas100);
        restante = restante - usar100 * 100;

        int usar50 = restante / 50;
        usar50 = Math.min(usar50, notas50);
        restante = restante - usar50 * 50;

        int usar20 = restante / 20;
        usar20 = Math.min(usar20, notas20);
        restante = restante - usar20 * 20;

        int usar10 = restante / 10;
        usar10 = Math.min(usar10, notas10);
        restante = restante - usar10 * 10;

        if (restante != 0){

            System.out.println("Não foi possível realizar o saque com as notas disponíveis.");
        }
        notas100 -= usar100;
        notas50 -= usar50;
        notas20 -= usar20;
        notas10 -= usar10;
    }


}
