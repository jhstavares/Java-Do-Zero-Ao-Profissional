package fundamentosJava.console;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Boa");
        System.out.println("tarde!\n\n");

        System.out.println("Bom");
        System.out.println("Dia");

        System.out.printf("Megasena:  %d %d %d\n", 1, 2, 3); // formatação


        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade : ");
        int idade = entrada.nextInt();

        System.out.println(nome + " " + sobrenome + " " + idade);

        entrada.close();



    }
}
