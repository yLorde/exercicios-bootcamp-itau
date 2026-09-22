package desafios;

import java.util.Scanner;

public class DuasPessoasDiferentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome da primeira pessoa? ");
        String namePerson1 = scanner.next();

        System.out.printf("Qual a idade de %s? ", namePerson1);
        int agePerson1 = scanner.nextInt();

        System.out.println("Qual o nome da segunda pessoa? ");
        String namePerson2 = scanner.next();

        System.out.printf("Qual a idade de %s? ", namePerson2);
        int agePerson2 = scanner.nextInt();

        int diferencaDeIdade = agePerson1 - agePerson2;
        if (diferencaDeIdade < 1) diferencaDeIdade = diferencaDeIdade * -1;

        System.out.printf("A diferença de idade de %s e %s é de %s anos!", namePerson1, namePerson2, diferencaDeIdade);

        scanner.close();
    }
}
