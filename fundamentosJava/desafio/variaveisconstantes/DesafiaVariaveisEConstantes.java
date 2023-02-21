package fundamentosJava.desafio.variaveisconstantes;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DesafiaVariaveisEConstantes {
    public static void main(String[] args) {

        // (ºF - 32) X 5/9 = ºC

        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double fahenheit = 86;
        double celsius = (fahenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é: " + celsius + "ºC.");

        fahenheit = 0;
        celsius = (fahenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é: " + celsius + "ºC.");




    }
}
