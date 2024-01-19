package entities;

public class PessoaJuridica extends Pessoa{
    private Integer qntdFuncionarios;

    public PessoaJuridica(){
    }

    public PessoaJuridica(String nome, Double renda, Integer qntdFuncionarios) {
        super(nome, renda);
        this.qntdFuncionarios = qntdFuncionarios;
    }

    public Integer getQntdFuncionarios() {
        return qntdFuncionarios;
    }

    public void setQntdFuncionarios(Integer qntdFuncionarios) {
        this.qntdFuncionarios = qntdFuncionarios;
    }

    @Override
    public Double valorImposto() {
        if (qntdFuncionarios < 10) {
            return getRenda() * 0.16;
        } else {
            return getRenda() * 0.14;
        }
    }
}
