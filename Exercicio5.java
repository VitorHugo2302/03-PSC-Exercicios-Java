//Escreva um programa em Java para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida pela equação: IMC = pesoaltura2. A situação do peso é determinada pela tabela abaixo:
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
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura em metros (exemplo: 1,70) ");
        double altura = entrada.nextDouble();

        double imc = (peso) / Math.pow(altura, 2);

        System.out.println("IMC: " + imc);
        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 20 & imc < 25) {
            System.out.println("Peso Normal");
        } else if (imc >= 25 & imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 & imc < 40) {
            System.out.println("Obeso");
        } else if (imc >= 40) {
            System.out.println("Obeso Mórbido");
        }

        entrada.close();
    }
}
