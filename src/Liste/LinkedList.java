package Liste;

/**
 * Created by PAGNI1731620 on 2018-03-19.
 */
public class LinkedList<T> implements List<T> {
    private Node head;
    private Node tail;
    private int size=0;

    public void addElement(T contenu) {

        if (size == 0) {
            head=new Node(contenu);
            tail=head;
        }
        else {
            tail.setNext(new Node(contenu));
            tail = tail.getNext();
        }
        size++;
    }

    public void addElement(int indice,T contenu) {
        if (indice==0){
            addElement(contenu);

        }
        else if (indice<=size){
            Node current=head;
            Node notCurrent=head.getNext();
            for (int i=0; i<indice-1; i++) {
                current = current.getNext();
                notCurrent = notCurrent.getNext();
            }

            current.setNext(new Node(contenu));
            current.getNext().setNext(notCurrent);
        }
        size++;
    }
    public T getElement(int indice) {
        Node current = head;
        if (indice==0){
            current.getNode();
        }
        else {

            for (int i = 0; i < indice; i++) {
                current = current.getNext();
            }

        }
        return (T) current.getNode();
    }

    public void setElement(int indice, T contenu) {
        Node current = head;
        for (int i = 0; i < indice; i++) {
            current=current.getNext();
        }
        current.setNode(contenu);

    }

    public void removeElement(int indice) {
        if (indice == 0) {
            head = head.getNext();
        }
        else {
            Node current = head;
            for (int i=0;i<indice-1;i++){
                current =current.getNext();

            }
            current.setNext(current.getNext().getNext());

        }
        size--;
    }

    public void clear() {
        head=null;
        tail=null;
        size=0;
    }

    public int size() {
        return size;
    }
}