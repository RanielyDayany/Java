package estruturaDeDados.matriz;

import javax.swing.JOptionPane;

public class Somar {
    public static void main(String args[]){
        int MatSoma[][], a, b, soma = 0;
        MatSoma = new int [10][12];

        for (a = 0 ; a <= 9; a++){
            for(b = 0 ; b <= 11 ; b++){
                MatSoma[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
                soma = soma + MatSoma[a][b];
            }

        }
        System.out.println("A soma dos 120 valores digitador é: "+ soma);
        System.exit(0);
    }

}
