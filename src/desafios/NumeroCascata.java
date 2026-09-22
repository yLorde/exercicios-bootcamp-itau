package desafios;

import java.util.Scanner;

public class NumeroCascata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número >> ");
        int firstNumber = scanner.nextInt();

        System.out.print("Digite o segundo número >> ");
        int secondNumber = scanner.nextInt();

        System.out.print("Você deseja números pares ou ímpares >> ");
        String option = scanner.next();

        if (option.equalsIgnoreCase("par")) {
            for (int i = secondNumber; i >= firstNumber; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (option.equalsIgnoreCase("impar") || option.equalsIgnoreCase("ímpar")) {
            for (int i = secondNumber; i >= firstNumber; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
