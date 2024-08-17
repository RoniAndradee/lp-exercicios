import java.util.concurrent.ThreadLocalRandom;

public class Exe01 {
    public static void main(String[] args) {
                Integer qtdFilhos0a3 = ThreadLocalRandom.current().nextInt(0,5);
                Integer qtdFilhos4a16 = ThreadLocalRandom.current().nextInt(0,5);
                Integer qtdFilhos17a18 = ThreadLocalRandom.current().nextInt(0,5);

                System.out.println("Você tem um total de %d filhos e vai receber R$%.2f de bolsa.".formatted((qtdFilhos0a3 + qtdFilhos4a16 + qtdFilhos17a18), (qtdFilhos0a3 * 25.12) + (qtdFilhos4a16 * 15.88) + (qtdFilhos17a18 * 12.44)));
    }
}
