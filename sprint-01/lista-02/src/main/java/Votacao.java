import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
        Integer qtdVotosMussarela = 0;
        Integer qtdVotosCalabresa = 0;
        Integer qtdVotosQuatroQueijos = 0;

        for(int i = 1; i <= 10; i++){
            Integer voto = ThreadLocalRandom.current().nextInt(1, 4);

            if(voto == 1){
                qtdVotosMussarela++;
            } else if(voto == 2){
                qtdVotosCalabresa++;
            } else {
                qtdVotosQuatroQueijos++;
            }
        }

        System.out.println("O sabor mussarela teve um total de: %d votos! \nO sabor calabresa teve um total de: %d votos! \nO sabor quatro queijos teve um total de %d votos!".formatted(qtdVotosMussarela, qtdVotosCalabresa, qtdVotosQuatroQueijos));

         if(qtdVotosMussarela > qtdVotosCalabresa && qtdVotosMussarela > qtdVotosQuatroQueijos){
            System.out.println("O sabor favorito segundo a pesquisa foi Mussarela!");
        } else if(qtdVotosCalabresa > qtdVotosMussarela && qtdVotosCalabresa > qtdVotosQuatroQueijos){
            System.out.println("O sabor favorito segundo a pesquisa foi Calabresa!");
        } else if(qtdVotosQuatroQueijos > qtdVotosMussarela && qtdVotosQuatroQueijos > qtdVotosCalabresa){
            System.out.println("O sabor favorito segundo a pesquisa foi Quatro Queijos!");
        } else {
             System.out.println("Houve um empate na pesquisa!");
         }
    }
}
