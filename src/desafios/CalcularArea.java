package desafios;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho do lado do quadrado?");
        int side = scanner.nextInt();

        int area = side * side;
        System.out.printf("A área do quadrado é de: %s", area);

        scanner.close();
    }
}
