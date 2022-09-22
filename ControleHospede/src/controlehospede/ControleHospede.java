/*
        3. Escreva um programa Java que receba o valor padrão de uma diária. Em seguida, 
        receba vários nomes de hóspedes e suas idades. Caso o hóspede seja menor que 4 anos, 
        ele não paga hospedagem – nesses casos mostre na tela “(Nome do hóspede) possui gratuidade”; 
        hóspedes com mais de 80 anos pagam metade – mostre na tela “(Nome do hóspede) paga meia”. 
        O usuário informará hóspedes até digitar a palavra “PARE”, que interrompe a entrada de dados. 
        Ao fim, mostre a quantidade de gratuidades, a quantidade de meias hospedagens e o valor total,
        considerando todos os hóspedes informados
 */
package controlehospede;

import java.util.Scanner;

public class ControleHospede {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);

        float diaria;
        String nome, parar;
        int idade, cont = 0, cont1 = 0, cont2 = 0;

        System.out.println("##### Sistema Nosso Hotel #####\n");

        System.out.println("Informe o valor padrão da diária: ");
        diaria = entrada.nextFloat();

        do {
            System.out.println("\nInforme o nome do hóspede: ");
            nome = entrada1.nextLine();
            System.out.println("Informe a idade do hóspede: ");
            idade = entrada2.nextInt();

            if (idade >= 4 && idade <= 80) {
                System.out.println("\nValor para hospedagem desse hóspede: R$" + diaria);
                cont++;
            } else if (idade < 4) {
                System.out.println("\n" + nome + " possui gratuidade.");
                cont1++;
            } else if (idade > 80) {
                System.out.println("\n" + nome + " paga meia.");
                System.out.println("Valor para hospedagem desse hóspede: R$ " + diaria / 2);
                cont2++;
            }
            System.out.println("\nDeseja continuar digitando hóspedes ? ");
            parar = entrada3.nextLine();

        } while (!"PARE".equals(parar));

        System.out.println("\nTotal de gratuidades: " + cont1);
        System.out.println("Total de meias entradas: " + cont2 + "\n");

        cont = (int) (cont * diaria);
        cont2 = (int) (cont2 * diaria / 2);

        System.out.println("Valor total da hospedagem: R$ " + (cont + cont2));
    }

}
