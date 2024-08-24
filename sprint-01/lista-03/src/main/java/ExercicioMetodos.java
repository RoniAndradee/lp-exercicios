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
        Integer fatorial = 1;
        for (int i = 1; i <= valor; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    Boolean verificarPrimo(Integer valor){
        if (valor < 2) {
            return false;
        }
        for (int i = 2; i <= valor / 2; i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }

    Integer calcularPotencia(Integer base, Integer expoente){
        Integer resultado = 1;

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    Integer calcularTrocoEmBalas(Double valorCompra, Double valorRecebido){
        Integer qtdBalas = 0;
        Double troco = valorRecebido - valorCompra;

        for (Double i = troco; i >= 0.25; i -= 0.25) {
            qtdBalas++;
        }

        return qtdBalas;
    }

    Boolean verificarPalindromo(String palavra){
        palavra = palavra.replaceAll(" ", "");
        palavra = palavra.toLowerCase();
        Integer tamanhoPalavra = palavra.length();
        Integer qtdCaracteresIguais = 0;
        Integer contador = 0;

        for(int i = (tamanhoPalavra - 1); i >= 0; i--){
            if(palavra.charAt(i) == palavra.charAt(contador)){
                qtdCaracteresIguais++;
            }
            contador++;
        }
        return qtdCaracteresIguais.equals(tamanhoPalavra);
    }
}
