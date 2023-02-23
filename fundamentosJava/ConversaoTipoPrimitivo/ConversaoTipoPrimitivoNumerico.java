package fundamentosJava.ConversaoTipoPrimitivo;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1;
        System.out.println(a); // conversao implicita

        float b = (float) 1.123456788888;// conversao explicita (cast)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);


    }
}
