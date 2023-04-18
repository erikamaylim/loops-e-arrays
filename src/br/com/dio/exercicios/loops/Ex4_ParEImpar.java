package br.com.dio.exercicios.loops;

import java.text.MessageFormat;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 1;
        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) {
                quantPares++;
            }
            else {
                quantImpares++;
            }

            count++;
        } while(count <= quantNumeros);

        System.out.println(MessageFormat.format("Quantidade de pares digitados: {0}", quantPares));
        System.out.println(MessageFormat.format("Quantidade de ímpares digitados: {0}", quantImpares));
    }
}
