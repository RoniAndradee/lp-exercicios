public class ExercicioMetodos {

    Boolean verificaMaioridade(Integer idade){
        return idade >= 18;
    }

    Double calcularMedia(Double valor1, Double valor2, Double valor3){
        return ((valor1 + valor2 + valor3) / 3);
    }

    Integer maiorNumero(Integer valor1, Integer valor2, Integer valor3){
        return valor1 > valor2 && valor1 > valor3 ? valor1 : valor2 > valor1 && valor2 > valor3 ? valor2 : valor3;
    }

    Integer calcularFatorial(Integer valor){
        int fatorial = 1;
        for (int i = 1; i <= valor; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

}
