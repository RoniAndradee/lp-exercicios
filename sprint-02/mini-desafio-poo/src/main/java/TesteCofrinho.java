public class TesteCofrinho {
    public static void main(String[] args) {
        Cofrinho cofrinho01 = new Cofrinho();
        cofrinho01.meta = "Comprar moto";
        cofrinho01.deposito(140.10);
        System.out.println("Saldo do cofrinho %s: R$%.2f".formatted(cofrinho01.meta, cofrinho01.saldo));
        System.out.println("Você agitou o cofrinho e o valor retirado foi: R$%.2f".formatted(cofrinho01.agitar()));
        System.out.println("O novo saldo após agitar é de: %.2f".formatted(cofrinho01.saldo));
        cofrinho01.quebrar();
        cofrinho01.deposito(150.6);

        System.out.println("\n--------------------------------------------------\n");

        Cofrinho cofrinho02 = new Cofrinho();
        cofrinho02.meta = "Reserva de emergência";
        cofrinho02.deposito(5000.21);
        System.out.println("Saldo do cofrinho %s: R$%.2f".formatted(cofrinho02.meta, cofrinho02.saldo));
        System.out.println("Você agitou o cofrinho e o valor retirado foi: R$%.2f".formatted(cofrinho02.agitar()));
        System.out.println("O novo saldo após agitar é de: %.2f".formatted(cofrinho02.saldo));
        cofrinho02.quebrar();
        cofrinho02.agitar();
        cofrinho02.quebrar();
    }
}
