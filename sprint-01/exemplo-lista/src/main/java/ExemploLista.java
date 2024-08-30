import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        List listaEstranha = new ArrayList();
        listaEstranha.add(true);
        listaEstranha.add("Bob");
        listaEstranha.add(42);

        List<String> nomes = new ArrayList();
        nomes.add("Bob da Silva");
        nomes.add("José");
        nomes.add("Maria");

        System.out.println("Segundo nome da lista: " + nomes.get(1));

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome %d: %s".formatted(i, nomes.get(i)));
        }

        nomes.set(1, "Xampson");

        //Principais metodos de lista java
        // add - adicionar item
        // size - tamanho da lista (length)
        // get - busca elemento por indice
        // set - altera elemento por indice
        // remove - remove item por indice
        // isEmpety - retorna true se a lista estiver vazia
        // clear - limpa a lista
    }
}
