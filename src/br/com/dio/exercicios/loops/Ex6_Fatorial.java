package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.printf("%d! = ", fatorial);
        for(int i = fatorial; i >= 1; i--) {
            if (i == 1) {
                System.out.printf("%d = ", i);
            } else {
                System.out.printf("%d x ", i);
            }

            multiplicacao *= i;
        }

        System.out.print(multiplicacao);
    }

}
