package desafios;

public class VamosDeWhile {
    public static void main(String[] args) {
        boolean canRun = true;
        byte runs = 0;

        while (canRun) {
            runs++;
            System.out.println(runs);
            if (runs > 126) canRun = false;
        };
    }
}
