package desafios;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual sua altura? ");
        float height = scanner.nextFloat();

        System.out.print("Qual seu peso? ");
        float weight = scanner.nextFloat();

        float imc = weight / (height * height);

        System.out.println(imc);

        if (imc < 18.5f) System.out.println("Abaixo do peso");
        if (imc > 18.5f && imc < 25.0f) System.out.println("Peso Ideal");
        if (imc > 24.9f && imc < 30.0f) System.out.println("Levemente accim do peso");
        if (imc > 29.9f && imc < 35.0f) System.out.println("Obesidade Grau I");
        if (imc > 34.9f && imc < 40.0f) System.out.println("Obesidade Grau II (Severa)");
        if (imc > 40.0f) System.out.println("Obesidade III (Mórbida)");

        scanner.close();
    }
}
