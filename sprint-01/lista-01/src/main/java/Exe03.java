import java.util.concurrent.ThreadLocalRandom;

public class Exe03 {
    public static void main(String[] args) {
        Double valorUnitario = ThreadLocalRandom.current().nextDouble(10.99, 150.99);
        Integer qtdVendida = ThreadLocalRandom.current().nextInt(1, 10);
        Double valorPago = ThreadLocalRandom.current().nextDouble(10.99, 1100.00);
        Double valorTotal = (valorUnitario * qtdVendida);

        if(valorPago > valorTotal){
        System.out.println("Seu troco será de R$%.2f.".formatted(valorPago - valorTotal));
        } else {
            System.out.println("O valor que foi dado pelo cliente não é suficiente para pagar a conta! \nValor dado: %.2f \nValor da compra: %.2f".formatted(valorPago, valorTotal));
        }
    }
}

