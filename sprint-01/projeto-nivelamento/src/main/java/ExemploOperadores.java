public class ExemploOperadores {
    public static void main(String[] args) {
        //Operadores
        // + soma
        // - subtração
        // / divisão
        // * multiplicação
        // ++ soma +1
        // -- subtrai -1
        // +=
        // -=
        // *=
        // %

        Double numero01 = 42.0;
        Double numero02 = 10.0;

        Double resultadoPotencia = Math.pow(numero01, numero02);
        System.out.println("Resultado Potência" + resultadoPotencia);

        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Multiplicacao: " + (numero01 * numero02));
        System.out.println("Subtracao: " + (numero01 - numero02));
        System.out.println("Divisao: " + (numero01 / numero02));


    }
}
