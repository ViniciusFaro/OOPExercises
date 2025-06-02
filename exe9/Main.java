package exe9;

public class Main {
    public static void main(String[] args) {
        CaixaDeMensagem<String> notas = new CaixaDeMensagem<>();

        notas.adicionarMensagem("Olá mundo!");
        notas.adicionarMensagem("Eu sou uma caixa de String");

        CaixaDeMensagem<Notificacao> notificacoes = new CaixaDeMensagem<>();

        notificacoes.adicionarMensagem(new Notificacao("Carlos", "Boa tarde, quando marcaresmo a reunião?"));
        notificacoes.adicionarMensagem(new Notificacao("Ana", "Te amo vini!")); // te amo também nalu <3

        notas.listarMensagens();
        notificacoes.listarMensagens();
    }
}
