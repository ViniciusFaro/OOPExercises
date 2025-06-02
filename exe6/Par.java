package exe6;

public class Par<K, V> {
    // estrutura basica de um dicionario em java
    private K chave;
    private V valor;

    public void setchave(K chave) {
        this.chave = chave;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public K getchave() {
        return this.chave;
    }

    public V getValor() {
        return this.valor;
    }
}
