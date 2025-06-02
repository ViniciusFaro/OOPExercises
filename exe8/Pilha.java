package exe8;

public class Pilha<T> {
    No<T> cabeca;
    private int tam;

    public Pilha() {
        this.cabeca = null;
        this.tam = 0;
    }

    public void enqueue(T chave) {
        if (tam == 0) {
            this.cabeca = new No<>(chave);
            tam++;
            return;
        }
        No<T> novo = new No<>(chave);
        novo.setProx(cabeca);
        cabeca = novo;
        tam++;
    }

    public void dequeue() {
        if (tam == 0) {
            return;
        }
        cabeca = cabeca.getProx();
        tam--;
        return;
    }

    public void percorrer(){
        No<T> atual = cabeca;
        for (int i = 0; i < tam; i++){
            System.out.println("[ " + atual.getChave() + " ]");
            atual = atual.getProx();
        }
    }

}
