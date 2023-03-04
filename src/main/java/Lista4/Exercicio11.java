package Lista4;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavra;
        String reverso = "";

        System.out.println("Digite uma palavra ");
        palavra = input.nextLine();

        for (int i = (palavra.length() - 1); i >= 0; i--) {
            reverso += palavra.charAt(i);


        }

        if (reverso.equals(palavra)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");


        }
    }
}
