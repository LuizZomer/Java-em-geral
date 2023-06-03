package fundamentos;

public class tipoString {
    public static void main(String[] args) {
        String s = "Boa tarde";
        System.out.println("Olá pessoal".charAt(0));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.endsWith("pai"));
        System.out.println(s.length());
        System.out.println(s.contains("B"));
        // System.out.println(s.substring(4));
        System.out.println(s.substring(4,6));
        // System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Luiz";
        var sobrenome = "Zomer";
        var idade = 19;
        var salario = 1215.300;
        // System.out.printf("O %s %s tem %d anos e ganha %.2f reais", nome, sobrenome, idade, salario);

        String frase = String.format("\nO %s %s tem %d anos e ganha %.2f reais", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }

}
