package Test;

import Liste.ArrayList;
import Liste.LinkedList;
import Liste.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by PAGNI1731620 on 2018-03-26.
 */
class LinkedListTest {
    List<String> linkedList;
    @BeforeEach
    void setUp() {
        linkedList= new LinkedList();
        for (int i=0;i<3;i++){
            linkedList.addElement("Élément"+i);
        }
    }

    @Test
    void addElement() {
        linkedList.addElement("Oui");
        linkedList.addElement("Non");
        linkedList.addElement("allo");
        assertEquals("Élément0",linkedList.getElement(0));
        assertEquals("Élément1",linkedList.getElement(1));
        assertEquals("Élément2",linkedList.getElement(2));
        assertEquals("Oui",linkedList.getElement(3));
        assertEquals("Non",linkedList.getElement(4));
        assertEquals("allo",linkedList.getElement(5));
    }

    @Test
    void addElement1() {
        linkedList.addElement(3,"Bonjour");
        assertEquals("Élément0",linkedList.getElement(0));
        assertEquals("Élément1",linkedList.getElement(1));
        assertEquals("Élément2",linkedList.getElement(2));
        assertEquals("Bonjour",linkedList.getElement(3));

    }

    @Test
    void getElement() {
        assertEquals("Élément0",linkedList.getElement(0));
        assertEquals("Élément1",linkedList.getElement(1));
        assertEquals("Élément2",linkedList.getElement(2));
    }

    @Test
    void setElement() {
        linkedList.setElement(0,"Allo");
        linkedList.setElement(1,"Allo2");
        assertEquals("Allo", linkedList.getElement(0));
        assertEquals("Allo2", linkedList.getElement(1));
        assertEquals("Élément2", linkedList.getElement(2));
    }

    @Test
    void removeElement() {
        linkedList.removeElement(1);
        assertEquals("Élément0", linkedList.getElement(0));
        assertEquals("Élément2", linkedList.getElement(1));

    }

    @Test
    void clear() {
        linkedList.clear();
        assertEquals(0,linkedList.size());
    }

    @Test
    void size() {
        assertEquals(3,linkedList.size());
    }

}