package hotelauditorio;

import java.util.Scanner;
  public class HotelAuditorio {
    public static void main(String[] args) {

        System.out.println("##### Sistema Nosso Hotel #####\n");

        int Qtdconvidados;
        int TotalAlfa = 220;
        int Alfa = 150;
        int Beta = 350;
        int Adicional;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de convidados: ");
        Qtdconvidados = entrada.nextShort();

        if (Qtdconvidados > 0 && Qtdconvidados <= Alfa) {
            System.out.println("O Auditório mais adequado é o Alfa,sem a necessidade de adicionar cadeiras. \n");
        } else if (Qtdconvidados > Alfa && Qtdconvidados <= TotalAlfa) {
            Adicional = Qtdconvidados - Alfa;
            System.out.println("O Auditório mais adequado é o Alfa e serão necessarias " + Adicional + " Cadeiras Adicionais. \n");
        } else if (Qtdconvidados > TotalAlfa && Qtdconvidados <= Beta) {
            System.out.println("O Auditório mais adequado é o Beta");
        } else {
            System.out.println("Quantidade de hóspedes inválida, digite um numero menor que 350 e maior que 0.");
        }
    }
}
