package Lista4;

import java.util.Arrays;

public class Exercicio2 {

    public static void main(String[] args) {

        int[] vetor = {5,1,4,2,7,8,3,6};
        int[] vetor2 = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor2[i] = vetor[i] * 2;
        }
        System.out.println("valor do vetor 2 " + Arrays.toString(vetor2));

    }
    }

