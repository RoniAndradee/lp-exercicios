import java.util.List;

public class MetodosComLista {
    void exibeListaDeNomes(List<String> nomes){
        for (int i = 0; i <nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
