package Lista4;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int[] vetorQ = new int[10];
        int maior = 0;
        int posicao = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite um número par para a posição " + i + ": ");
            int vmz = imput.nextInt();
            if (vmz % 2 == 0) {
                vetorQ[i] =vmz;
            } else {
                System.out.println("Número inválido X Digite um número par.");
            }
        }
        for (int i = 0; i < 10; i++) {
            if (vetorQ[i] > maior) {
                maior = vetorQ[i];
                posicao = i;
            }
        }
        System.out.println("O maior elemento de Q é " + maior + ", que está na posição " + posicao);

        imput.close();
    }
}




