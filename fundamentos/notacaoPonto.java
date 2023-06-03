package fundamentos;

public class notacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Zomito");
        s = s
        .toUpperCase();
        s = s
        .concat("!!!");
        System.out.println(s);

        System.out.println("Zomer".toUpperCase());

        int b = "Luizada".length();
        System.out.println(b);
    }
    

}
