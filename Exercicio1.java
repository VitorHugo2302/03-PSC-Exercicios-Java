//Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. O algoritmo deverá seguir todas as regras da divisão de números reais.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18.pkg03.pkg24;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("Resultado da divisão: " + resultado);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        entrada.close();
    }

}
