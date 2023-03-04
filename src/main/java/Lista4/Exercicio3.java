package Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] M = new int[10];
        System.out.println("valor armazenado: ");
        int X = imput.nextInt();

        for (int i = 0; i < a.length; i++) {
            M[i] = a[i] * X;

        }
        System.out.println("valor gerado: " + Arrays.toString(M));
    }


}
