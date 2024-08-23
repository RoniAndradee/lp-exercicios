import java.util.Scanner;

public class ProjetoExercicios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ExercicioMetodos metodos = new ExercicioMetodos();


        Integer valor = 6;

        System.out.println(metodos.calcularFatorial(valor));
    }
}
