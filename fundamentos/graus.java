package fundamentos;
public class graus {
    public static void main(String[] args) {
        double f = 0;
        final int ajuste = 32;
        final double fator = 5.0/9.0;  
        double conversao = (f - ajuste) * fator;

        System.out.println("O resultado é "+conversao+"ºC");
        
        f = 60;
        conversao = (f - ajuste) * fator;
        System.out.println("O resultado é "+conversao+"ºC");
    }
}
