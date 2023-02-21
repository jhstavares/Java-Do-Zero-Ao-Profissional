package fundamentosJava.exercicios.variaveisEconstantes;

public class AreaCircunferencia {
    public static void main(String[] args) {

        // double -> Número flutuante
        // final double -> O valor não pode ser mudado por causa do FINAL.

        double raio = 3.4;
        double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI *raio*raio;

        System.out.println(area);
        System.out.println("Area = " + area);

    }
}
