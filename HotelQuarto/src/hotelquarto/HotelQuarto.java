/* Escreva um programa Java que faça a troca de quartos entre dois hospedes.
Receba o nome de um cliente e sua idade; ele a princípio será hospedado no quarto A. 
Depois receba o nome de outro cliente e sua idade; se ele for mais jovem, ficará no quarto B,
mas se for velho que o primeiro cliente, ele ficará no quarto A e o primeiro cliente ficará no quarto B.
Além disso, se a pessoa mais velha for idosa (tem 60 anos ou mais)terá desconto de 40%. 
Mostre ao final o nome do cliente que ficou no quarto A e o desconto, se possuir, e qual ficou no quarto B
 */
package hotelquarto;

import java.util.Scanner;

public class HotelQuarto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        System.out.println(" #####  Sistema Nosso Hotel #####\n");

        String[] hospede = new String[2];
        int[] idade = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("\nDigite o nome do " + (i + 1) + "° Hópede");
            hospede[i] = entrada.nextLine();

            System.out.println("Digite a idade do Hóspede: ");
            idade[i] = entrada2.nextInt();
        }
        for (int i = 0; i < 1; i++) {
            if (idade[0] > idade[1] && idade[0] >= 60) {
                System.out.println("\nQuarto A: " + hospede[0] + ", Hóspede possui 40% de desconto");
                System.out.println("Quarto B: " + hospede[1]);

            } else if (idade[0] > idade[1]) {
                System.out.println("\nQuarto A: " + hospede[0]);
                System.out.println("Quarto B: " + hospede[1]);

            } if (idade[1] > idade[0] && idade[1] >= 60) {
                System.out.println("\nQuarto A: " + hospede[1] + ", Hóspede possui 40% de desconto");
                System.out.println("Quarto B: " + hospede[0]);
            
            } else if (idade[1] > idade[0]) {
                System.out.println("\nQuarto A: " + hospede[1]);
                System.out.println("Quarto B: " + hospede[0]);
            }

        }

    }
}
