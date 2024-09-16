package school.sptech.ex2;

public class TesteEncomendas {

    public static void main(String[] args) {
        Encomenda e1 = new Encomenda();
        e1.tamanho = "G";
        e1.enderecoRemetente = "Praça 14 de agosto, 200";
        e1.enderecoDestinatario = "Rua cassiana silva, 123";
        e1.distancia = 65.2;
        e1.valorProduto = 143.50;

        System.out.println("O frete da E1 é de: R$" + e1.calcularFrete());
        System.out.println("O valor total da encomenda é de: R$%.2f".formatted(e1.valorTotalDaEncomenda()));
        e1.aplicarCupomDeDesconto(15);
        System.out.println("O valor total da encomenda com o cupom de desconto é de: R$%.2f".formatted(e1.valorTotalDaEncomenda()));

    }
}
