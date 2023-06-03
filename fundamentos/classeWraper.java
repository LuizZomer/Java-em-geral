package fundamentos;

public class classeWraper {
    public static void main(String[] args) {
        Byte b = 1;
        Short s = 1000;
        // Integer i = Integer.parseInt(entrada.nextLine());

        Integer i = 10000;
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        // System.out.println(i * 3);

        Float f = 123.4F;
        System.out.println(f);
        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        Character c = '#'; //char
        System.out.println(c.toString());
    }
}
