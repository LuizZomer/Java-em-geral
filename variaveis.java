public class variaveis {
    public static void main(String[] args) {
        // System.out.println(2+3);
        double raio = 3.4;
        final double pi = 3.14159; //final para valores constantes(Imutraveis ao longo do codigo)


        double area = pi * raio * raio;

        System.out.println(area); 

        raio = 10;
        area = pi * raio * raio;
        System.out.println("Área = " + area + "m²"); 

    }
}
