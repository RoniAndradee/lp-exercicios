package school.sptech.ex3;

public class Funcionario {
    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Integer percentualReajuste){
        salario += (percentualReajuste / 100.0) * salario;
    }

    Double calcularValorHora(){
        return salario / 220.0;
    }

    Double calcularHoraExtra(Integer qtdHorasExtra, Integer percentualAdicionalNotoruno){
        Double adicionalNoturno = (percentualAdicionalNotoruno / 100.0) * calcularValorHora();
        return qtdHorasExtra * (calcularValorHora() + adicionalNoturno);
    }

}
