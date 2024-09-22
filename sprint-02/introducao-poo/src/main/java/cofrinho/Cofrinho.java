package cofrinho;

import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
    // Atributos
    private String meta;
    private Double saldo;
    private Boolean quebrado;

    //Construtor
    public Cofrinho(String meta, Boolean quebrado) {
        this.meta = meta;
        this.saldo = 0.0;
        this.quebrado = quebrado;
    }

    //Construtor sobrecarregado, sem receber a meta.
    public Cofrinho(Double saldo, Boolean quebrado) {
        this.meta = "Não possui";
        this.saldo = 0.0;
        this.quebrado = quebrado;
    }

    // métodos
    void depositar(Double valorDeposito) {
        if(podeDepositar(valorDeposito)) {
            saldo += valorDeposito;
        } else {
            System.out.println("Erro no deposito!");
        }
    }

    //métodoo sobrecarregado
    void depositar(Double valorDeposito, Double valorDesconto) {
        if(podeDepositar(valorDeposito)) {
            saldo += valorDeposito - valorDesconto;
        } else {
            System.out.println("Erro no deposito!");
        }
    }

    private Boolean podeDepositar(Double valor){
        return valor > 0 && !quebrado;
    }

    Double agitar() {
        if(!quebrado) {
            Double sorteado = ThreadLocalRandom.current().nextDouble(0, saldo);
            saldo -= sorteado;
            return sorteado;
        }

        return null;
    }

    Double quebrar(){
        if(!quebrado) {
            System.out.println("Você quebrou o cofrinho: %s".formatted(meta));
            saldo = 0.0;
            quebrado = true;
            return saldo;
        }
        System.out.println("O cofrinho %s já esta quebrado!".formatted(meta));
        return null;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Boolean getQuebrado() {
        return quebrado;
    }

}
