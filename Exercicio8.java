//Você está trabalhando em uma startup voltada para educação, e ficou responsável por criar a lógica de uma das atividades. Seu programa deve receber o valor dos três lados de um triângulo, e informar se ele é equilátero, isósceles ou escaleno. Restrição: Em um triângulo, o comprimento de um lado é sempre menor do que a soma dos outros dois!
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
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do lado 1 do triângulo:");
        double lado1 = entrada.nextDouble();

        System.out.print("Digite o valor do lado 2 do triângulo:");
        double lado2 = entrada.nextDouble();

        System.out.print("Digite o valor do lado 3 do triângulo:");
        double lado3 = entrada.nextDouble();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo válido.");
        }

        entrada.close();
    }
}
