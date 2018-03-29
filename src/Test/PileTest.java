package Test;

import Liste.Pile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PileTest {
    Pile pile;
    @BeforeEach
    void setUp() {
        pile= new Pile();
        for (int i=0;i<3;i++){
            pile.push("Élément"+i);
        }
    }

    @Test
    void push() {
        pile.push("Élément3");
        assertEquals("Élément3",pile.peek());
    }

    @Test
    void pop() {
        assertEquals("Élément2",pile.peek());
        pile.pop();
        assertEquals("Élément1",pile.peek());
        pile.pop();
        assertEquals("Élément0",pile.peek());

    }

    @Test
    void peek() {
        assertEquals("Élément2",pile.peek());
        pile.pop();
        assertEquals("Élément1",pile.peek());
        pile.pop();
        assertEquals("Élément0",pile.peek());
    }

    @Test
    void clear() {
        pile.clear();
        assertEquals(0,pile.size());
    }

    @Test
    void size() {
        assertEquals(3,pile.size());
    }

}