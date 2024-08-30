import java.util.Scanner;

public class TesteMetodos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        MetodosDivertidos metodos = new MetodosDivertidos();

        System.out.println("----------01---------- \nDigite um número de 0 a 10:");
        Integer numero = leitor.nextInt();

        Integer qtdSorteios = metodos.avaliandoSorte(numero);

        if (qtdSorteios <= 3) {
            System.out.println("""
                    Seu número foi sorteado em %d tentativas.
                    Você é MUITO sortudo!
                    ----------------------
                    """.formatted(qtdSorteios));
        } else if (qtdSorteios > 4 && qtdSorteios <= 10) {
            System.out.println("""
                    Seu número foi sorteado em %d tentativas.
                    Você é sortudo!
                    ----------------------
                    """.formatted(qtdSorteios));
        } else {
            System.out.println("""
                    Seu número foi sorteado em %d tentativas.
                    É melhor você parar de apostar e ir trabalhar!
                    ----------------------
                    """.formatted(qtdSorteios));
        }

        Integer somaSorteados = metodos.exibeSomaSorteio();
        System.out.println("""
                ----------02----------
                A soma dos números é: %d
                ----------------------
                """.formatted(somaSorteados));

        System.out.println("----------03----------");
        metodos.exibeImpares();
        System.out.println("----------------------");

        Integer posicao = metodos.posicaoSorteio(65);
        if(posicao.equals(-1)) {
            System.out.println("""
                    ----------04----------
                    O dó! seu número não foi sorteado nas 200 tentativas!);
                    ----------------------
                    """);
        } else {
            System.out.println("""
                    ----------04----------
                    Seu número foi sorteado na %dº tentativa!
                    ----------------------
                    """.formatted(posicao));
        }
    }
}
