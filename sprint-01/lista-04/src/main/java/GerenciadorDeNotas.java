package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeNotas {
    List<Double> lerNotas(){
        List<Double> notas = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o numero de notas");
        Integer qtdNotas = ler.nextInt();
        Double nota = 0.0;

        if(qtdNotas > 0) {
            for (int i = 1; i <= qtdNotas; i++) {
                System.out.println("Informe a nota: " + i);
                nota = ler.nextDouble();
                notas.add(nota);
            }
        } else {
            return notas;
        }

        return notas;
    }

    Double calcularMedia(List<Double> notas) {
        Double media = 0.0;

        if (notas == null || notas.isEmpty()) {
            return null;
        }

        for (int i = 0; i < notas.size(); i++) {
            media += notas.get(i);
        }

        return media / notas.size();
    }

    Boolean verificarResultado(Double media){
        if (media == null || media < 0.0) {
            return null;
        } else if (media >= 7){
            return true;
        }

        return false;
    }

}
