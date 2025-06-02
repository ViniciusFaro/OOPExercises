package exe10;

public class Funcionario {
    private String nome;
    private int bonificacao;
    private boolean recebeu_bonificacao;

    public Funcionario(String nome, int bonificacao) {
        this.nome = nome;
        this.bonificacao = bonificacao;
        this.recebeu_bonificacao = false;
    }

    public boolean solicitarBonificacao(FundoEmpresarial f) {
        this.recebeu_bonificacao = f.pagar(bonificacao);
        return this.recebeu_bonificacao;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean getStatus() {
        return this.recebeu_bonificacao;
    }

    public void setStatus(boolean status) {
        this.recebeu_bonificacao = status;
    }

    public int getBonificacao() {
        return this.bonificacao;
    }

    @Override
    public String toString() {
        return "\nFuncionario: " + this.nome + "\n";
    }
}
