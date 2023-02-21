package fundamentosJava.TipoString;

public class TipoString {

    // String é um conjunto de caracter

    public static void main(String[] args) {
        System.out.println("Hello word".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!!"));
        System.out.println(s + "!!!"); // outra forma de concatenar

        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa")); // outra forma de mostrar valores boolean

        System.out.println(s.length());// Para saber o tamanho da string. Valor inteiro

        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("Boa tarde")); // ignora letras maiuscula e minuscula


    }
}
