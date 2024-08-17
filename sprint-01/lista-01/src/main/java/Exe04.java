public class Exe04 {
    public static void main(String[] args) {
        String nome = "Maria";
        Double nota1 = 10.0;
        Double nota2 = 7.5;

        System.out.println("Olá, %s. Sua média foi de %.2f".formatted(nome, ((nota1 + nota2) / 2)));
    }
}
