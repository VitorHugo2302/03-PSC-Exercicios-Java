//Crie um programa para exibir o menu de um caixa eletrônico. Ele deve possuir as opções: Exibir saldo, Exibir extrato, Realizar depósito, Realizar saque, e Sair. Se alguma opção inválida for fornecida, exiba uma mensagem de erro e saia do programa. Observação: Utilize a estrutura de seleção Switch/Case para implementar seu produto. Utilize números inteiros para indicar cada opção.

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
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha uma opção do caixa eletrônico:");
        System.out.println("1 - Exibir saldo");
        System.out.println("2 - Exibir extrato");
        System.out.println("3 - Realizar depósito");
        System.out.println("4 - Realizar saque");
        System.out.println("5 - Sair");

        System.out.print("Digite o número correspondente à opção que deseja: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Exibir saldo.");
                break;
            case 2:
                System.out.println("Exibir extrato.");
                break;
            case 3:
                System.out.println("Realizar depósito.");
                break;
            case 4:
                System.out.println("Realizar saque.");
                break;
            case 5:
                System.out.println("Sair.");
                break;
            default:
                System.out.println("Opção inválida. Escolha um número de 1 a 5.");
                break;
        }

        entrada.close();
    }
}
