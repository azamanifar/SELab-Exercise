package singleton;

import static org.junit.Assert.*;
import org.junit.Test;

public class HasherTest {

    @Test
    public void testSingleInstance() {
        Hasher sc1 = Hasher.getInstance();
        Hasher sc2 = Hasher.getInstance();
        assertNotNull(sc1);
        assertSame(sc1, sc2);
    }

    @Test
    public void testFunction() {
        Hasher sc1 = Hasher.getInstance();
        assertEquals(sc1.MD5("naeim"), "5e898f5f132bf4544379ca7f9418b929");
        assertEquals(sc1.MD5("taheri"), "91b59c1b39c8f128775e960558b6210");
        assertEquals(sc1.SHA256("naeim"), "c19a96229a1aa859e7010a817782493510262a082ad1dea120c3fc93b288bdde");
        assertEquals(sc1.CRC32("naeim"), "aa9a6a97");
    }

}
