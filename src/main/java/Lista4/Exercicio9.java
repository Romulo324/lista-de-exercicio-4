package Lista4;

import java.util.Scanner;

public class Exercicio9 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int num = input.nextInt();
            char resultado = verificaNumero(num);
            System.out.println("O número digitado é " + resultado);
        }

        public static char verificaNumero(int num) {
            if (num > 0) {
                return 'P';
            } else {
                return 'N';
            }
        }
    }

