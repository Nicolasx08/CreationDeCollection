package Liste;


/**
 * Created by PAGNI1731620 on 2018-03-19.
 */
public class ArrayList<T> implements List<T> {
    private T tableau[] = (T[])new Object[10];
    private int tailleList=0;

    public void addElement(T contenu){
        if (tailleList<=tableau.length){
            tableau[tailleList]=contenu;
        }
        else {
            grossi();
            tableau[tailleList+1]=contenu;
        }

        ++tailleList;
    }
    public void addElement(int indice,T contenu) {
        if (tailleList<=tableau.length){
            if (tableau[indice]==null){
                tableau[indice]=contenu;
            }
            else {
                System.out.print("Vous avez déjà un objet!");
            }

        }
        else {
            grossi();
            tableau[indice]=contenu;
        }
        ++tailleList;
    }

    public T getElement(int indice) {
        return (T)tableau[indice];
    }
    public void setElement(int indice, T contenu) {
        if (tableau[indice]!=null){
            tableau[indice]=contenu;
        }
        else {
            tableau[indice]=contenu;
        }

    }
    public void removeElement(int indice) {
        tableau[indice]=null;
        tailleList--;
        for (int i=(indice+1);i<tableau.length;i++){
            tableau[i-1]=tableau[i];
        }
    }
    public void clear() {
        for (int i=0;i<tableau.length;i++){
            tableau[i]=null;
        }
        tailleList=0;
    }
    public int size() {
        return tailleList;
    }
    public void grossi(){
        T tableau2[]=(T[])new Object [tableau.length*2];
        for (int i = 0;i<tableau.length;i++){
            tableau2[i]=tableau[i];
        }
        tableau=tableau2;






    }
}