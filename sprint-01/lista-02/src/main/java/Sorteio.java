import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Integer numeroEscolhido = ThreadLocalRandom.current().nextInt(1, 101);
        Integer primeiraVezSorteado = -1;
        Integer qtdPares = 0;
        Integer qtdImpares = 0;

        for(int i=1; i <= 200; i++){
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1, 101);

            if(numeroSorteado.equals(numeroEscolhido) && primeiraVezSorteado == -1){
                primeiraVezSorteado = i;
            }

            if(numeroSorteado % 2 == 0){
                qtdPares++;
            } else if (numeroSorteado % 2 != 0){
                qtdImpares++;
            }
        }

        System.out.println("O número escolhido " + (primeiraVezSorteado == -1 ? "não foi sorteado." : "foi sorteado pela 1ª vez na " + primeiraVezSorteado + "ª repetição."));
        System.out.println("Foram sorteados um total de: %d números pares \nForam sorteados um total de: %d números ímpares".formatted(qtdPares, qtdImpares));
    }
}
