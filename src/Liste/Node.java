package Liste;

/**
 * Created by PAGNI1731620 on 2018-03-22.
 */
public class Node<T> {
    private T node;
    private Node next;

    public Node(T node) { this.node = node; }
    public Node getNext() {return next;}
    public void setNext(Node next) {this.next = next;}
    public T getNode() {return node;}
    public void setNode(T node) {this.node = node;}
}