package Lista4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros;
        int digitos = 1;
        System.out.println("Digite um numero: ");
        numeros = input.nextInt();
        while (numeros >= 10) {
            numeros /= 10;
            digitos++;
        }
        System.out.println("A  quantidade de digitos foi de: " + digitos);
        input.close();
    }

}
