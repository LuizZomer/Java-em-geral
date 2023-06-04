package exercicios;

import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salario 1: ");
        String s1txt = teclado.nextLine().replace(",", ".");
        System.out.println("Digite o salario 2: ");
        String s2txt = teclado.nextLine().replace(",", ".");
        System.out.println("Digite o salario 3: ");
        String s3txt = teclado.nextLine().replace(",", ".");

        double s1 = Double.parseDouble(s1txt);
        double s2 = Double.parseDouble(s2txt);
        double s3 = Double.parseDouble(s3txt);
        
        double media = (s1+s2+s3)/3;
        System.out.printf("A media dos seus 3 ultimos salarios são: %.2f",media);
        teclado.close();
    }
}
