//Escreva um programa em Java para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
//- Se quantidade <= 5, o desconto será de 2%
//- Se quantidade > 5 e quantidade <=10, o desconto será de 3%
//- Se quantidade > 10 e quantidade <30, o desconto será de 5%
//- Se quantidade >= 30 o desconto será de 10%

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
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricaoProduto = entrada.nextLine();

        System.out.print("Digite a quantidade adquirida do produto '" + descricaoProduto + "': ");
        int quantAdquirida = entrada.nextInt();

        System.out.print("Digite o preço unitário do produto '" + descricaoProduto + "': ");
        double valorUnitario = entrada.nextDouble();

        double totalProduto = quantAdquirida * valorUnitario;
        System.out.println("Total do produto (sem desconto): " + totalProduto);

        double desconto = 0;

        if (quantAdquirida <= 5) {
            desconto = totalProduto * 0.02;
        } else if (quantAdquirida > 5 && quantAdquirida <= 10) {
            desconto = totalProduto * 0.03;
        } else if (quantAdquirida > 10 && quantAdquirida < 30) {
            desconto = totalProduto * 0.05;
        } else if (quantAdquirida >= 30) {
            desconto = totalProduto * 0.10;
        }

        System.out.println("Desconto: " + desconto);
        System.out.println("Total do produto (com desconto): " + (totalProduto - desconto));

        entrada.close();
    }
}
