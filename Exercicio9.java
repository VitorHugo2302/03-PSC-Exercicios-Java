//(Decom/UFOP - Adaptado) A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela: Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral. Entrada: QUAL A IDADE DA PESSOA?: 17 Saída: ELEITOR FACULTATIVO
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
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();
        
        if (idade < 16) {
            System.out.println("Não é eleitor");
        } else if (idade >= 16 & idade <= 17) {
            System.out.println("Eleitor facultativo");
        } else if (idade >= 18 & idade <= 65) {
            System.out.println("Eleitor obrigatório");
        } else if (idade > 65) {
            System.out.println("Eleitor facultativo");
        }

        entrada.close();
    }
}
