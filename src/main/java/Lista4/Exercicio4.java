package Lista4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        String[] nomes = new String[5];
        String Achei;
        System.out.println("informe os nomes");
        for (int i = 0; i < nomes.length; i++) {

            nomes[i] = imput.nextLine();
        }
        System.out.println("informe os nomes");
        Achei = imput.nextLine();
        boolean Achado = false;


        for (String nome : nomes) {

            if (Achei.equals(nome)) {
                Achado = true;

                imput.close();

            }

        }
        if (Achado == true){
            System.out.println("Achei");
        }else {
            System.out.println("Não achei");
        }
        imput.close(); }
}

