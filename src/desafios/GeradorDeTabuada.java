package desafios;

import java.util.Scanner;

public class GeradorDeTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual número deseja gerar a taboada? ");
        byte number = scanner.nextByte();

        for (byte i = 1; i < 11; i++) {
            System.out.printf("%s x %s = %s\n", number, i, number * i);
        }

        scanner.close();
    }
}
