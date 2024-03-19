//Escreva um programa que peça ao usuário que insira um número de 1 a 4, correspondendo a cada estação do ano (1 para Primavera, 2 para Verão, 3 para Outono, e 4 para Inverno) para identificar a estação escolhida e imprimir uma mensagem característica daquela estação.

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
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha uma estação do ano:");
        System.out.println("1 - Primavera");
        System.out.println("2 - Verão");
        System.out.println("3 - Outono");
        System.out.println("4 - Inverno");

        System.out.print("Digite o número correspondente à estação que deseja: ");
        int estacao = entrada.nextInt();

        switch (estacao) {
            case 1:
                System.out.println("A primavera chegou, trazendo consigo cores vibrantes e perfumes suaves.");
                break;
            case 2:
                System.out.println("Época de dias longos, praias e diversão ao ar livre.");
                break;
            case 3:
                System.out.println("O ar fresco e as cores quentes pintam uma paisagem de beleza única.");
                break;
            case 4:
                System.out.println("Dias mais curtos, noites mais longas, e a magia do Natal no ar.");
                break;
            default:
                System.out.println("Opção inválida. Escolha um número de 1 a 4.");
                break;
        }

        entrada.close();
    }
}
