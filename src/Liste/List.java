package Liste;
/**
 * Created by PAGNI1731620 on 2018-03-19.
 */
public interface List<T> {
    void addElement(int indice,T object);
    void addElement(T object);
    void removeElement(int indice);
    T getElement(int indice);
    void setElement(int indice, T object);
    void clear();
    int size();
}