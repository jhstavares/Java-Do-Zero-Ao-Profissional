package fundamentosJava.Wrapprs;

import java.util.Scanner;

public class Wrapprs {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //whapprs - embrullho -> Empacotado

        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; // int
        Integer k = Integer.parseInt("10000");
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(k);
        System.out.println(i*3);
        System.out.println(l / 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Character c = '#'; // char
        System.out.println(c + "...");

        entrada.close();

    }
}
