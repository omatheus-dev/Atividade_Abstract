package entities;

public class PessoaFisica extends Pessoa{

    private Double gastoSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double renda, Double gastoSaude) {
        super(nome, renda);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double valorImposto() {
        if (getRenda() < 20000.00) {
            return (getRenda() * 0.15) - (gastoSaude * 0.5);
        } else {
            return (getRenda() * 0.25) - (gastoSaude * 0.5);
        }
    }
}
