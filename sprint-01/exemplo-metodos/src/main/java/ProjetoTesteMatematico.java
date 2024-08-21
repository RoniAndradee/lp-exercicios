public class ProjetoTesteMatematico {
    public static void main(String[] args) {
        MetodosUteis metodosLegais = new MetodosUteis();
        Double num01 = 42.0;
        Double num02 = 10.1;

        Double soma = metodosLegais.somar(num01, num02);
        System.out.println(soma);
        System.out.println(metodosLegais.somar(12.3, 29.4));
    }
}
