public class ExemploRevisao {
    public static void main(String[] args) {

        // Tipos Wrapper, são uma classe, ou seja, possuem métodos que ajudam.
        // Valor inicial de Wrapper é igual a null.
        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.55;
        Boolean bloqueado = false;

        //Tipos primitivos, não são classes, ou seja, sem ajuda.
        //Tipo primitivo sempre tem valor inicial.
        boolean bloqueado2 = false;
        int teste = 12;
        double salario = 1500.00;


        //System.out.println("Meu nome é " + nome + "\nminha altura é " + altura + "\ne minha idade é " + idade);

        //print com interpolação.
        System.out.println("Meu nome é %s \nminha altura é %.2f \ne minha idade é %d".formatted(nome, altura, idade));

        //print com interpolação com text block
        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                Nome do Pet: %s
                """.formatted(nome, idade, altura, "Caramelo"));



    }
}
