package fundamentos;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("\nOlá %s %s, você tem %d anos", nome, sobrenome, idade);

        entrada.close();
        // Arrumando o problema da nextInt

        // int idade = entrada.nextInt();
        // entrada.nextLine();
        // System.out.print("Digite o seu sobrenome: ");
        // String nome = entrada.nextLine();
        // System.out.print("Digite o seu sobrenome: ");
        // String nome1 = entrada.nextLine();

        


    }
}
