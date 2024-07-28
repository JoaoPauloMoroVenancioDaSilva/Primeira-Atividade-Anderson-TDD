package com.acme.greeter;

import java.util.Arrays;
import java.util.Scanner;


public class Greeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Usuário inforando os números
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        double num3 = scanner.nextInt();

        double [] Ordenados = OrdenarNumeros(num1, num2, num3); //Colocando os números em um vetor e os ordenando
        ImprimirNumeros(Ordenados); //Imprimindo os números de forma ordenada
    }
    public static double [] OrdenarNumeros(double n1, double n2, double n3){ //Organiza os números do menor para o maior
        double [] Lista = {n1, n2, n3};
        Arrays.sort(Lista);
        return Lista;
    }

    public static void ImprimirNumeros (double [] Lista) { //Imprime os números
        System.out.println("Esse é o menor número: " + Lista[0]);
        System.out.println("Esse é o número intermediário:  " + Lista[1]);
        System.out.println("Esse é o maior número: " + Lista[2]);
    }
}