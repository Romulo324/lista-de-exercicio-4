package Lista4;

import java.util.Scanner;

public class Exercicio13 {
    public static int exercicio13(String frase, char letra ) {
        int vezes = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                vezes++;
            }
        }
        return vezes;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        System.out.print("Digite uma letra: ");
        char letra = input.next().charAt(0);
        int count = exercicio13(frase, letra);
        System.out.println("A letra '" + letra + "' aparece " + count + " vezes na frase.");
    }

}
