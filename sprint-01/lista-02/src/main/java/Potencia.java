import java.util.concurrent.ThreadLocalRandom;

public class Potencia {
    public static void main(String[] args) {
        Integer base = ThreadLocalRandom.current().nextInt(1, 11);
        Integer expoente = ThreadLocalRandom.current().nextInt(1, 10);
        Integer resultado = 0;
        System.out.println("Base: " + base);
        System.out.println("Expoente: " + expoente);


        for (int i = 1; i <= expoente; i++) {
            if (i == 1){
                resultado = base;
            } else {
                resultado *= base;
            }
        }

        System.out.println("Resultado de %d^%d: %d".formatted(base, expoente, resultado));
    }
}
