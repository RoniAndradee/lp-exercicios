import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato c) {
        contatos.add(c);
    }

    public void remover(String nomeRemover) {
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getNome().equalsIgnoreCase(nomeRemover)) {
                contatos.remove(i);
            }
        }
    }

    public void removerPorTipo(String tipo) {
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getTipoContato().equalsIgnoreCase(tipo)) {
                contatos.remove(i);
            }
        }
    }

    public Integer getQuantidadeBloqueados() {
        Integer qtdBloqueados = 0;
        for (Contato c : contatos) {
            if(c.getBloqueado()) {
                qtdBloqueados++;
            }
        }

        return qtdBloqueados;
    }

    public Double somaValorDoacoes(){
        Double totalDoacoes = 0.0;
        for (Contato c : contatos) {
            totalDoacoes += c.getValorDoacao();
        }

        return totalDoacoes;
    }
}
