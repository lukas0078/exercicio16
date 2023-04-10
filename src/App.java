import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 09/04/2023 */

public class App {
    public static void main(String[] args) throws Exception {

		Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a área em M2 que será pintada? ");
        float area = entrada.nextFloat();
       
        float qntlatas = (float) Math.ceil(area / 54);
        float preço = qntlatas * 80;

        System.out.println("Latas: " + qntlatas + " unidades.");
        System.out.println("Preço: " + preço + " Reais.");

        entrada.close();

    }

}