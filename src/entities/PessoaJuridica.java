package entities;

public class PessoaJuridica extends Contribuinte {

    private Integer num_funcionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double renda_anual, Integer num_funcionarios) {
        super(nome, renda_anual);
        this.num_funcionarios = num_funcionarios;
    }

    public Integer getNum_funcionarios() {
        return num_funcionarios;
    }

    @Override
    public Double calcImposto() {
        double imposto = 0.0;
        if(num_funcionarios > 10){
           imposto = 0.14;
        } else {
            imposto = 0.16;
        }
        return renda_anual * imposto;
    }
}
