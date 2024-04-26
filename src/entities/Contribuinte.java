package entities;

public abstract class Contribuinte {


  protected String nome;
  protected Double renda_anual;


  public Contribuinte(){
  }

  public Contribuinte(String nome,Double renda_anual){
      this.nome = nome;
      this.renda_anual = renda_anual;
  }

    public String getNome() {
        return nome;
    }

    public Double getRenda_anual() {
        return renda_anual;
    }

    public abstract Double calcImposto();

}
