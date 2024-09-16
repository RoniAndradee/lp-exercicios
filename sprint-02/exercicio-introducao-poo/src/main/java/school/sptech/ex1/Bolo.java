package school.sptech.ex1;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;
    Integer quantidadeEmEstoque;

    void venderBolo(Integer qtdSolicitada){
        if(qtdSolicitada > 0 && qtdSolicitada <= quantidadeEmEstoque){
            quantidadeVendida += qtdSolicitada;
            quantidadeEmEstoque -= qtdSolicitada;
        }
    }

    void aumentarEstoque(Integer qtdAdicionada){
        if(qtdAdicionada > 0){
            quantidadeEmEstoque += qtdAdicionada;
        }
    }

    Integer quantidadeDisponivel(){
        return quantidadeEmEstoque;
    }

    Double totalVendido(){
        return valor * quantidadeVendida;
    }
}
