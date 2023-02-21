package fundamentosJava.notacaoPonto;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Jhonatan, X"; // texto delimitado com letras
        s = s.replace("X", "Senhor");
        s = s.toUpperCase();//Funcao
        s = s.concat("!!!");
        System.out.println(s);

        String x = "Santos".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Gesilda")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

    }
}
