package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios:\t");
        for (int numero : numerosAleatorios) {
            System.out.printf("%d\t", numero);
        }

        System.out.print("\nSeus Antecessores:\t");
        for (int numero : numerosAleatorios) {
            System.out.printf("%d\t", (numero-1));
        }

        System.out.print("\nSeus Sucessores:\t");
        for (int numero : numerosAleatorios) {
            System.out.printf("%d\t", (numero+1));
        }

    }

}
