package school.sptech.ex1;

public class TesteConfeitaria {

    public static void main(String[] args) {
        Bolo bolo1 = new Bolo();
        bolo1.sabor = "Chocolate";
        bolo1.valor = 25.4;
        bolo1.quantidadeEmEstoque = 5;
        bolo1.venderBolo(2);
        System.out.println("Estoque atualizado:" + bolo1.quantidadeDisponivel());
        bolo1.aumentarEstoque(5);
        bolo1.venderBolo(3);
        System.out.println("Estoque atualizado:" + bolo1.quantidadeDisponivel());
        System.out.println("Vendemos um total de R$" + bolo1.totalVendido() + " em bolos");
    }
}
