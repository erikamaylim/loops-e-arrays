package br.com.dio.exercicios.loops;

import java.text.MessageFormat;
import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 1;
        do {
            System.out.print("Número: ");
            numero = scan.nextInt();
            if (count == 1) {
                maior = numero;
            }

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }

            count++;
        } while(count <= 5);

        System.out.println(MessageFormat.format("Maior: {0}", maior));
        System.out.println(MessageFormat.format("Média: {0}", (soma/5)));

    }
}
