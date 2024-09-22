package cofrinho;

public class TesteCofrinho {
    public static void main(String[] args) {
        Cofrinho cofrinho01 = new Cofrinho("Comprar moto", false);
        cofrinho01.depositar(140.10);
        System.out.println("Saldo do cofrinho 01: R$%.2f".formatted(cofrinho01.getSaldo()));
        System.out.println("Você agitou o cofrinho e o valor retirado foi: R$%.2f".formatted(cofrinho01.agitar()));
        System.out.println("O novo saldo após agitar é de: %.2f".formatted(cofrinho01.getSaldo()));
        cofrinho01.quebrar();
        cofrinho01.depositar(150.6);

        System.out.println("\n--------------------------------------------------\n");

        Cofrinho cofrinho02 = new Cofrinho("Reserva de emergência", false);
        cofrinho02.depositar(5000.21);
        System.out.println("Saldo do cofrinho 02: R$%.2f".formatted(cofrinho02.getSaldo()));
        System.out.println("Você agitou o cofrinho e o valor retirado foi: R$%.2f".formatted(cofrinho02.agitar()));
        System.out.println("O novo saldo após agitar é de: %.2f".formatted(cofrinho02.getSaldo()));
        cofrinho02.quebrar();
        cofrinho02.agitar();
        cofrinho02.quebrar();

        System.out.println("\n--------------------------------------------------\n");

        Cofrinho cofrinho3 = new Cofrinho("Comprar bike",false);


        // Mudei de ideia, agora a meta do cofre 01 é comprar XPML11
        cofrinho01.setMeta("Comprar XPML11");
    }
}
