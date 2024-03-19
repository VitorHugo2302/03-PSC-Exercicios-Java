//Decom/UFOP) Na lojinha do Sr. Aboo, encontramos produtos de informática com preços especiais. Mas o Sr. Aboo segue uma receita de seus antepassados para acrescentar uma porcentagem sobre o valor de custo do produto, garantindo assim, a estabilidade financeira das futuras gerações de sua família. A tabela abaixo, feita pelo avô do Sr. Aboo, descreve o valor do lucro de um produto, considerando o valor de compra do mesmo. Para auxiliar o Sr. Aboo, codifique um programa que leia o valor da compra de um produto de informática e imprima a porcentagem do lucro e o valor da venda.  O programa deve exibir a mensagem "Lojinha do Sr. Aboo" e em seguida solicitar o valor da compra com o fornecedor, e, em seguida, exibir qual será a porcentagem de lucro e o valor que o item deve ser colocado para venda.
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
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = entrada.nextDouble();

        String lucro = "";
        double valorVenda = 0;

        if (valorCompra < 10) {
            lucro = "70%";
            valorVenda = valorCompra + (valorCompra * 0.7);
        } else if (valorCompra >= 10 && valorCompra < 30) {
            lucro = "50%";
            valorVenda += valorCompra + (valorCompra * 0.5);
        } else if (valorCompra >= 30 && valorCompra < 50) {
            lucro = "40%";
            valorVenda += valorCompra + (valorCompra * 0.4);
        } else if (valorCompra >= 50) {
            lucro = "30%";
            valorVenda += valorCompra + (valorCompra * 0.3);
        }

        System.out.println("Lucro de: " + lucro);
        System.out.println("Valor da venda: " + valorVenda);

        entrada.close();
    }
}
