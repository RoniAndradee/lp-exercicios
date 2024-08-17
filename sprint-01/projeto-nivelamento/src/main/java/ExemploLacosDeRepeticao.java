import java.util.concurrent.ThreadLocalRandom;

public class ExemploLacosDeRepeticao {
    public static void main(String[] args) {

        // for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // while
        Integer contador = 0;
        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt(0, 6);
        while (inteiroAleatorio != 3) {
            System.out.println("Não sorteou\n " + "Sorteado: " + inteiroAleatorio);
            inteiroAleatorio = ThreadLocalRandom.current().nextInt(0, 6);
        }



    }
}
