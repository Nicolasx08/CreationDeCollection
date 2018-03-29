package Liste;

public class File<T> {

    private LinkedList linkedList=new LinkedList();

    public void add(T contenu){

        linkedList.addElement(contenu);
    }
    public T remove(){
        T var = (T)linkedList.getElement(0);
        linkedList.removeElement(0);
        return var;
    }
    public T peek() {
        return (T)linkedList.getElement(0);
    }
    public void clear(){
        linkedList.clear();
    }
    public int size(){
        return linkedList.size();
    }
}