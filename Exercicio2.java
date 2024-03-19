//Escreva um programa em Java para ler as notas da 1ª, 2ª e  3ª avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que média igual ou maior que 7 o aluno é aprovado). Escrever também a média calculada.
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
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média foi de: " + media);
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno não foi aprovado!");
        }

        entrada.close();
    }
}
