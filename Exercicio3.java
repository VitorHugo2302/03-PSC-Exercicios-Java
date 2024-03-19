//Escreva um programa em Java para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
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
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade total de eleitores: ");
        int totalEleitores = entrada.nextInt();

        System.out.print("Digite a quantidade total de votos em branco: ");
        int votosEmBranco = entrada.nextInt();

        System.out.print("Digite a quantidade total de votos nulos: ");
        int votosNulos = entrada.nextInt();

        System.out.print("Digite a quantidade total de votos válidos: ");
        int votosValidos = entrada.nextInt();

        double percentualBrancos = (votosEmBranco * 100.0) / totalEleitores;
        double percentualNulos = (votosNulos * 100.0) / totalEleitores;
        double percentualValidos = (votosValidos * 100.0) / totalEleitores;
        
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
        entrada.close();
    }
}
