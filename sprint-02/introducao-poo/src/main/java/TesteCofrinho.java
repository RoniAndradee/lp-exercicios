public class TesteCofrinho {
    public static void main(String[] args) {
        Cofrinho comprarBike = new Cofrinho();
        comprarBike.deposito(140.10);
        System.out.println("Você agitou o cofrinho e o valor sorteado foi: R$" + comprarBike.agitar());
        comprarBike.quebrar();
        comprarBike.deposito(150.6);

        Cofrinho reservaDeEmergencia = new Cofrinho();
        reservaDeEmergencia.deposito(5000.21);
        System.out.println("Você agitou o cofrinho e o valor sorteado foi: R$" + reservaDeEmergencia.agitar());
        reservaDeEmergencia.quebrar();
        reservaDeEmergencia.agitar();
        reservaDeEmergencia.quebrar();
    }
}
