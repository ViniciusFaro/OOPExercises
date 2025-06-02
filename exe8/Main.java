package exe8;

public class Main {
    public static void main(String[] args){
        Pilha <Object> l = new Pilha<>();

        l.enqueue(true);
        l.enqueue("ola");
        l.enqueue(10);
        l.dequeue();
        l.enqueue(20.5);
        l.enqueue(true);
        l.dequeue();

        l.percorrer();
    }
}
