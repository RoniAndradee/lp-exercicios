import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {
    Integer avaliandoSorte(Integer numero){
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer qtdTentativas = 1;

        while(!numeroSorteado.equals(numero)){
            qtdTentativas++;
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        }

        return qtdTentativas;
    }

    Integer exibeSomaSorteio(){
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer soma = 0;

        while(!numeroSorteado.equals(0)){
            soma += numeroSorteado;
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        }

        return soma;
    }

    void exibeImpares(){
        for(int i = 0; i <= 90; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    Integer posicaoSorteio(Integer numero){
        Integer posicao = -1;

        for(int i = 1; i <= 200; i++){
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1, 101);

            if(numeroSorteado.equals(numero) && posicao.equals(-1)){
                posicao = i;
            }

        }

        return posicao;
    }
}
