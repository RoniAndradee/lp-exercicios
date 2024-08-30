package school.sptech;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    GerenciadorDeNotas gerenciador = new GerenciadorDeNotas();

    List<Double> notas = gerenciador.lerNotas();
    System.out.println("Notas: " + notas);

    Double media = gerenciador.calcularMedia(notas);
    System.out.println("Media: " + media);

    Boolean resultado = gerenciador.verificarResultado(media);
    if(resultado.equals(true)){
      System.out.println("Aluno APROVADO!!");
    } else {
      System.out.println("Aluno REPROVADO!!");
    }
  }
}