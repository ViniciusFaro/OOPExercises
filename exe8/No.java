package exe8;

public class No <T> {
    private T chave;
    private No<T> prox;

    public No(T chave){
        this.chave = chave;
        this.prox = null;
    }

    public void setChave(T chave){
        this.chave = chave;
    }

    public void setProx(No<T> prox){
        this.prox = prox;
    }

    public T getChave(){
        return this.chave;
    }

    public No<T> getProx(){
        return this.prox;
    }
}
