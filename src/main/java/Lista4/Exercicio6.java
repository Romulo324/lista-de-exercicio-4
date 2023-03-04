package Lista4;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        double[] temperaturas = new double[7];

        double maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        double soma = 0;

        double media = 0;

        int dias = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("informe a temperatura: ");
            temperaturas[i] = imput.nextDouble();

        }
        for (double temperatura : temperaturas) {
            if (temperatura > maior) {
                menor = temperatura;
            }
            if (temperatura < menor){
                maior = temperatura;
            }
            soma = soma + temperatura;
        }
        media =  soma / temperaturas.length;
        for (double temperatura : temperaturas) {
            if (temperatura < media) {
                dias = dias + 1;
            }

        }
        System.out.println("essa é a maior temperatura: " + maior);
        System.out.println("essa é a menor temperatura " + menor);
        System.out.println("essa é a media da semana: " + media);
        System.out.println("essa é a media dos dias " + dias);

        imput.close();
        }


    }
