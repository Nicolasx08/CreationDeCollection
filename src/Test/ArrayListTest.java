package Test;

import Liste.ArrayList;
import Liste.List;



import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by PAGNI1731620 on 2018-03-26.
 */
class ArrayListTest {
    List<String> arrayList;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arrayList=new ArrayList();
        for (int i=0;i<3;i++){
            arrayList.addElement("Élément"+i);
        }
    }

    @org.junit.jupiter.api.Test
    void addElement() {
        arrayList.addElement(3,"allo");
        arrayList.addElement(4,"Ordi");
        arrayList.addElement(5,"oui");
        assertEquals("Élément0",arrayList.getElement(0));
        assertEquals("Élément1",arrayList.getElement(1));
        assertEquals("Élément2",arrayList.getElement(2));
        assertEquals("allo",arrayList.getElement(3));
        assertEquals("Ordi",arrayList.getElement(4));
        assertEquals("oui",arrayList.getElement(5));
    }

    @org.junit.jupiter.api.Test
    void addFin() {
        arrayList.addElement("Non");
        arrayList.addElement("Oui");
        arrayList.addElement("Peut-etre");
        arrayList.addElement("Jsais pas");
        assertEquals("Élément0",arrayList.getElement(0));
        assertEquals("Élément1",arrayList.getElement(1));
        assertEquals("Élément2",arrayList.getElement(2));
        assertEquals("Non",arrayList.getElement(3));
        assertEquals("Oui",arrayList.getElement(4));
        assertEquals("Peut-etre",arrayList.getElement(5));
        assertEquals("Jsais pas",arrayList.getElement(6));

    }

    @org.junit.jupiter.api.Test
    void getElement() {
        arrayList.getElement(0);
        arrayList.getElement(1);
        arrayList.getElement(2);
        assertEquals("Élément0",arrayList.getElement(0));
        assertEquals("Élément1",arrayList.getElement(1));
        assertEquals("Élément2",arrayList.getElement(2));
    }

    @org.junit.jupiter.api.Test
    void setElement() {
        arrayList.setElement(0,"Github");
        arrayList.setElement(1,"IntelliJ");
        assertEquals("Github",arrayList.getElement(0));
        assertEquals("IntelliJ",arrayList.getElement(1));
        assertEquals("Élément2",arrayList.getElement(2));
    }

    @org.junit.jupiter.api.Test
    void removeElement() {
        arrayList.removeElement(1);
        assertEquals("Élément0",arrayList.getElement(0));
        assertEquals("Élément2",arrayList.getElement(1));
        assertEquals(null,arrayList.getElement(2));
    }

    @org.junit.jupiter.api.Test
    void clear() {
        arrayList.clear();
        assertEquals(null,arrayList.getElement(0));
        assertEquals(null,arrayList.getElement(1));
        assertEquals(null,arrayList.getElement(2));
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(3,arrayList.size());
    }
}