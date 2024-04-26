package entities;

public class PessoaFisica extends Contribuinte {

    private Double gastosSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double renda_anual, Double gastosSaude) {
        super(nome, renda_anual);
        this.gastosSaude = gastosSaude;
    }

    public Double getRendaAnual() {
        return renda_anual;
    }

    @Override
    public Double calcImposto() {
        Double imposto = 0.0;
        if (renda_anual < 2000) {
            imposto = 0.15;
        } else if (renda_anual >= 2000) {
            imposto = 0.25;
        }
        if (gastosSaude > 0) {
            return (renda_anual * imposto) - (gastosSaude * 0.5);
        }
        return (renda_anual * imposto);
    }
}
