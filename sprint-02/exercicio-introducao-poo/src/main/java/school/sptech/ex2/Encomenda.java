package school.sptech.ex2;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;

    Double calcularFrete(){
        Double valorFrete = 0.0;

        if(tamanho.equals("P")){
            valorFrete += valorProduto * 0.01;
        } else if(tamanho.equals("M")){
            valorFrete += valorProduto * 0.03;
        } else {
            valorFrete += valorProduto * 0.05;
        }

        if(distancia <= 50){
            valorFrete += 3.0;
        } else if(distancia > 50 && distancia <= 200){
            valorFrete += 5.0;
        } else {
            valorFrete += 7.0;
        }

        return valorFrete;
    }

    void aplicarCupomDeDesconto(Integer percentualDesconto){
        valorProduto -= (percentualDesconto / 100.0) * valorProduto;
    }

    Double valorTotalDaEncomenda(){
        return valorProduto + calcularFrete();
    }
}
