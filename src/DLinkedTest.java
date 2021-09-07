import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DlistTest {
    @Test
    void test() {
        DNode z, v;
        DList l = new DList();
        assertEquals("[]", l.toString(), "[]");

        z = new DNode("BWI", null, null);
        l.addLast(z);
        assertEquals("[BWI]", l.toString(), "[BWI]");

        z = new DNode("SFO", null, null);
        l.addLast(z);
        assertEquals("[BWI,SFO]", l.toString(), "[BWI,SFO]");

        z = new DNode("JFK", null, null);
        l.addFirst(z);
        assertEquals("[JFK,BWI,SFO]", l.toString(), "[JFK,BWI,SFO]");

        v = l.getLast(); // Pega o último node.
        assertEquals("SFO", v.getElement(), "SFO");

        z = new DNode("PVD", null, null);
        l.addBefore(v, z);
        assertEquals("[JFK,BWI,PVD,SFO]", l.toString(), "[JFK,BWI,PVD,SFO]");
    }
}
