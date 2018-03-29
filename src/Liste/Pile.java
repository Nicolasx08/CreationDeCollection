package Liste;

public class Pile<T> {

    private LinkedList linkedList= new LinkedList();

    public void push(T contenu){

        linkedList.addElement(contenu);
    }
    public T pop(){
        T var1 =(T) linkedList.getElement(linkedList.size()-1);
        linkedList.removeElement(linkedList.size()-1);
        return var1;
    }
    public T peek(){
        return (T)linkedList.getElement(linkedList.size()-1);
    }
    public void clear(){
        linkedList.clear();
    }
    public int size(){
        return linkedList.size();

    }
}