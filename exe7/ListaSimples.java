package exe7;

import java.util.ArrayList;

public class ListaSimples<T> {
    private ArrayList<T> elementos;

    public ListaSimples() {
        elementos = new ArrayList<>();
    }

    public void adicionarElementos(T elem){
        elementos.add(elem);
    }

    public int buscar(T chave){
        for (int i = 0; i < elementos.size(); i++){
            if (elementos.get(i) == chave){
                return i;
            }
        }
        return -1;
    }

    public void remover(T chave){
        int index = buscar(chave);
        if (index != -1){
            elementos.remove(index);
            return;
        }
        return;
    }
}
