package school.sptech.ex3;

public class TesteEmpresa {

    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.nome = "Bob";
        funcionario01.cargo = "Agile Master";
        funcionario01.salario = 6500.00;

        funcionario01.reajustarSalario(5);
        System.out.println("Salário corrigido pela inflação: " + funcionario01.salario);

        System.out.println("O funcionário: %s ganha um total de R$%.2f por hora trabalhada".formatted(funcionario01.nome, funcionario01.calcularValorHora()));
        System.out.println("O funcinário %s fez hora extra e ganhou: R$%.2f pelo tempo trabalhado".formatted(funcionario01.nome, funcionario01.calcularHoraExtra(1, 10)));
    }
}
