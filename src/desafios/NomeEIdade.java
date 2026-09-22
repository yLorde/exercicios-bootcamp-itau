package desafios;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello World");

        System.out.println("Qual o seu nome? ");
        String name = scanner.next();

        System.out.println("Qual a sua idade?");
        int age = scanner.nextInt();

        System.out.printf("Olá, %s, você tem %s anos!", name, age);
        scanner.close();
    }
}
