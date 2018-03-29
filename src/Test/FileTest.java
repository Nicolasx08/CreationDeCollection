package Test;

import Liste.File;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {
    File file;
    @BeforeEach
    void setUp() {
        file= new File();
        for (int i=0;i<3;i++){
            file.add("Élément"+i);
        }
    }

    @Test
    void remove() {
        assertEquals("Élément0", file.remove());
        assertEquals("Élément1", file.remove());
    }

    @Test
    void peek() {
        assertEquals("Élément0",file.peek());
    }

    @Test
    void clear() {
        file.clear();
        assertEquals(0,file.size());
    }

    @Test
    void size() {
        assertEquals(3,file.size());
    }

}