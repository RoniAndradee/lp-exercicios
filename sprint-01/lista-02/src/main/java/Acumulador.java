import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer soma = 0;

        while (numeroSorteado != 0) {
            soma += numeroSorteado;
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        }

        System.out.println("A soma dos números é: " + soma);

    }
}
