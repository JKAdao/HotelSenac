/*
 Monte um programa Java que mostre na tela em formato de tabela os quartos ocupados e os desocupados. 
Considere que o hotel tem 4 andares e 3 quartos por andar. Primeiro o usuário registrará os quartos ocupados, 
informando para cada ocupação o número do apartamento (andar de 1 a 4 e número de quarto, de 1 a 3). 
O programa deverá questionar “Deseja informar outra ocupação? (S/N)” 
e o usuário poderá informar quantos quartos quiser, até que responda “N” a essa pergunta. 
Em seguida o programa mostrará uma tabela, em que o primeiro andar é o inferior e o último o superior,
marcando com X o quarto ocupado. 
 */


package marcacaoquarto;

import java.io.IOException;
import java.util.Scanner;

public class MarcacaoQuarto {

    public static void main(String[] args) throws IOException {

        System.out.println("##### Sistema Nosso Hotel #####\n");

        String[][] Hotel = new String[4][5];
        char conti;
        int andar, quarto;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ");
        System.out.println();

        do {
            System.out.println("Informe o andar e o quarto: ");

            System.out.print("Andar: ");
            andar = entrada.nextInt();

            System.out.print("Quarto: ");
            quarto = entrada.nextInt();

            Hotel[quarto][andar] = "X | Ocupado";

            System.out.println("\nDeseja informar outra ocupação? (S/N)");
            conti = (char) System.in.read();
            System.out.println();

        } while (conti == 'S');

        System.out.println("Ocupação do Hotel\n");

        for (int i = 4; i > 0; i--) {
            System.out.println();
            System.out.println("Andar " + (i));
            System.out.println();

            for (int j = 1; j <= 3; j++) {
             
                if (!"X | Ocupado".equals(Hotel[j][i])) {
                   Hotel[j][i]  = "Desocupado";
                    
                }
                System.out.println("Quarto " + (j) + ": " + Hotel[j][i] );

            }

        }

    }

}
