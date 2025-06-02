package exe9;

public class Notificacao {
    private String remetente;
    private String conteudo;

    public Notificacao(String remetente, String conteudo) {
        this.remetente = remetente;
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Notificação de " + remetente + "\n\n" + conteudo;
    }
}
