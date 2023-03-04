package Lista4;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroprimo;
        int divisores = 0;

        System.out.println("Digite um numero");
        numeroprimo = input.nextInt();

        for (int i = 1; i <= numeroprimo; i++) {
            if (numeroprimo % i == 0) {
                divisores++;
            }
        }
        if (divisores ==2 ){
            System.out.println("O número é primo . ");
        }else{
            System.out.println("O número não é primo. ");
        }
    }
}