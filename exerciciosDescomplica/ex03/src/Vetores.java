public class Vetores {
    public static void main (String [] args){
        int[] numbers = {1,2,3,4,5};
        //Inicialização com valores
        //String[] names = {"Alice","Bob","Charlie"};
        //Inicialização com valores

        int[] numeros = new int[5];
        //Inicialização de um vetor de 5 inteiros
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        //String[] nomes = new String[3];
        //Inicialização de um vetor de 3 strings

        //Mostrar
        System.out.println("Vetor de números inic valores: "+numbers);
        //Ele me mostra a posição da memória ao invés de 
        //me mostrar os elementos que eu coloquei,porque
        //eu preciso percorrer pra ver os valores e nao apenas
        //pedir pra motrar conforme na linha acima
        System.out.println("Vetor de números inic manualmente:" +numeros);

        //percorrer
        System.out.println("Valores do vetor usando For");
        for(int i= 0; i<numbers.length;i++){
            System.out.println("Elementos na posição ["+i+"]:"+numbers[i]);
        }
        System.out.println("Valores do vetor usando For");
        for(int i=0;i<numeros.length;i++){
            System.out.println("Elementos na posição ["+i+"]:"+numeros[i]);
        }
        }
}
