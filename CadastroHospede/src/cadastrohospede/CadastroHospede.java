/*
4. Monte um algoritmo em que o usuário poderá cadastrar e pesquisar hóspedes. 
O algoritmo deve oferecer um menu com três opções ao usuário: 1- cadastrar; 2- pesquisar; 3- sair.
A opção “cadastrar” deve permitir que o usuário informe um nome de hóspede, gravando-o em memória (máximo de 15 cadastros; 
caso atinja essa quantidade, mostre “Máximo de cadastros atingido”). 
A opção “pesquisar” deve permitir que o usuário informe um nome e, 
caso seja encontrado um nome exatamente igual, mostre a mensagem 
“Hospede (nome) foi encontrado no índice (índice onde foi cadastrado)”. 
Se o nome não foi encontrado mostre “Hóspede não encontrado”. 
O algoritmo deve permitir que o usuário realize essas operações repetidas vezes,
até que use a opção “3”, que encerra o algoritmo
 */
package cadastrohospede;

import java.util.Scanner;

public class CadastroHospede {

    public static void main(String[] args) {

        System.out.println("##### Sistema Nosso Hotel #####\n");
        System.out.println("1 - Cadastrar hóspede | 2 - Pesquisar hóspedes cadastrados | 3 - Sair\n");

        int opcao, cont = 0;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);

        String[] nomeH = new String[15];
        String pesquisa;
        boolean encontrou;

        System.out.println("Escolha uma opção para prosseguir: ");
        opcao = entrada.nextInt();

        if (opcao == 1) {
            System.out.println("\n======== Opcão 1 registro de hóspedes =========");
            while (opcao == 1) {
                System.out.println("\nDigite o nome do hóspede para registra-lo:");
                nomeH[cont] = entrada2.nextLine();
                cont++;

                System.out.println("\n1 - Cadastrar hóspede | 2 - Pesquisar hóspedes cadastrados | 3 - Sair: ");
                opcao = entrada.nextInt();

                if (cont >= 15) {
                    System.out.println("\nMáximo de cadastros de hóspedes atingido.\n\n");
                    System.out.println("2 - Pesquisar hóspedes cadastrados | 3 - Sair: ");
                    opcao = entrada.nextInt();
                }
            }
        }
        if (opcao == 2) {
            System.out.println("\n\n======== Opcão 2 escolhida , pesquisa de hóspedes =========\n");

            do {
                System.out.println("\nDigite o hóspede que deseja pesquisar:");
                pesquisa = entrada3.nextLine();

                encontrou = false;
                for (int i = 0; i < 15; i++) {
                    if (pesquisa.equals(nomeH[i])) {
                        System.out.println("\nHóspede " + pesquisa + " encontrado no índice " + (i));
                        encontrou = true;

                        System.out.println("\n\n2 - Pesquisar hóspedes cadastrados | 3 - Sair:");
                        opcao = entrada.nextInt();
                    }
                }

                if (encontrou == false) {
                    System.out.println("\nHóspede não encontrado.\n");
                    System.out.println("\n2 - Pesquisar hóspedes cadastrados | 3 - Sair:");
                    opcao = entrada.nextInt();
                }
            } while (opcao == 2);

        }
    }

}
