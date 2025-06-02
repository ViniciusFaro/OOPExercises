package exe9;

import java.util.ArrayList;

public class CaixaDeMensagem<T> {
    private ArrayList<T> mensagens = new ArrayList<>();

    public void adicionarMensagem(T mensagem) {
        mensagens.add(mensagem);
    }

    public T getMensagem(int index) {
        return mensagens.get(index);
    }

    public void listarMensagens() {
        System.out.println("Listando mensagens:");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < mensagens.size(); i++) {
            System.out.println(mensagens.get(i)); // metodo toString foi sobrescrito
        }
        System.out.println("-------------------------------------------");
    }

    public void removerMensagem(int index) {
        mensagens.remove(index);
    }

    public int totalMensagens() {
        return this.mensagens.size();
    }
}
