package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {5, 10, -2, 8, 12, -20};

        System.out.print("Vetor: ");
        int count =0;
        while(count < vetor.length) {
            if (count == vetor.length - 1) {
                System.out.printf("%d ", vetor[count]);
            } else {
                System.out.printf("%d, ", vetor[count]);
            }
            count++;
        }

        System.out.print("\nVetor: ");
        for (int item : vetor){
            if (item == vetor[vetor.length - 1]){
                System.out.printf("%d ", item);
            } else{
                System.out.printf("%d, ", item);
            }
        }

        System.out.print("\nVetor: ");
        for(int i = vetor.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.printf("%d ", vetor[i]);
            } else{
                System.out.printf("%d, ", vetor[i]);
            }
        }


    }
}
