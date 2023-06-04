package fundamentos;

import javax.swing.JOptionPane;

public class conversao {
    public static void main(String[] args) {
        double a = 1;
        System.out.println(a);

        float b = (float) 1.0; //ou 1.0F
        System.out.println(b);

        int c = 4;
        byte d = (byte)c;
        System.out.println(d);

        //De numero para string
        Integer num1 = 10000;
        System.out.println(num1.toString());

        int num2 = 1000;
        System.out.println(Integer.toString(num2));

        //De String para numero
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ") ;
        String valor2 = JOptionPane.showInputDialog("Digite outro valor: ") ;

        System.out.println(valor1 + valor2);

        double n1 = Double.parseDouble(valor1);
        double n2 = Double.parseDouble(valor2);
        double soma = n1 + n2;

        System.out.println(soma);
        System.out.println("Média é "+ soma/2);

       
    }
}
