import java.util.Scanner;

public class ProjetoTeste {
    public static void main(String[] args) {
        // Criando um objeto para utilizar seus metodos
        Scanner scan = new Scanner(System.in);
        MetodosUteis metodosLegais = new MetodosUteis();

        System.out.println("Digite o seu nome:");
        String nome = scan.nextLine();

        metodosLegais.exibirUsuario(nome);


    }
}
