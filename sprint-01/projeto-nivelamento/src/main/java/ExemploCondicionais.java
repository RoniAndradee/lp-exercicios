public class ExemploCondicionais {
    public static void main(String[] args) {
        Integer idade = 19;

        String nome01 = "Bob";
        String nome02 = "Bob";

        if (nome01.equals(nome02)) {
            System.out.println("O nome é igual");
        } else {
            System.out.println("O nome é diferente!");
        }

        if (idade >= 18){
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }

        // Operador ternário
        String resultadoMaioridade = idade > 18 ? "Sim" : "Não";
        System.out.println("É maior de idade " + resultadoMaioridade);
    }
}
