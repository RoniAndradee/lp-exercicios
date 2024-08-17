import java.util.concurrent.ThreadLocalRandom;

public class Exe02 {
    public static void main(String[] args) {
        Integer tempoAquecimento = ThreadLocalRandom.current().nextInt(1, 15);
        Integer tempoAerobicos = ThreadLocalRandom.current().nextInt(15, 60);
        Integer tempoMusculacao = ThreadLocalRandom.current().nextInt(30, 120);

        System.out.println("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.".formatted((tempoAquecimento + tempoAerobicos + tempoMusculacao), ((tempoAquecimento * 12) + (tempoAerobicos * 20) + (tempoMusculacao * 25))));
    }
}
