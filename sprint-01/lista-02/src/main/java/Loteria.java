import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Integer numeroEscolhido = ThreadLocalRandom.current().nextInt(0, 11);
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer qtdSorteios = 0;

        while (numeroSorteado != numeroEscolhido) {
            System.out.println("O número sorteado foi: " + numeroSorteado);
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
            qtdSorteios++;
        }

        if (qtdSorteios <= 3){
            System.out.println("Você é MUITO sortudo!");
        } else if(qtdSorteios >= 4 && qtdSorteios <= 10){
            System.out.println("Você é sortudo!");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar!");
        }
    }
}
