package iterator;

import org.junit.Before;
import org.junit.Test;
import java.util.Iterator;
import static org.junit.Assert.*;

public class TVChannelsTest {

    TVChannels channelsOne;

    @Before
    public void setUp() throws Exception {
        channelsOne = new TVChannels();
        channelsOne.add("Ch.1");
        channelsOne.add("Ch.2");
        channelsOne.add("Ch.Sport");
        channelsOne.add("Ch.4");
        channelsOne.add("Ch.Tehran");
        channelsOne.add("Ch.iFilm");
        channelsOne.add("Ch.Nassim");
        channelsOne.add("Ch.HD");
    }

    @Test
    public void testNormalIterator() {
        Iterator<String> iterator = channelsOne.iterator();
        for (int i = 0; i < channelsOne.size(); i++)
        {
            assertTrue(iterator.hasNext());
            assertEquals(channelsOne.get(i), iterator.next());
        }
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testEvenIterator() {
        Iterator<String> iterator = channelsOne.iteratorEvenChannels();
        assertTrue(iterator.hasNext());
        assertTrue(iterator.hasNext());
        assertTrue(iterator.hasNext());
        assertTrue(iterator.hasNext());
        assertEquals(iterator.next(), "Ch.2");
        assertTrue(iterator.hasNext());
        assertEquals(iterator.next(), "Ch.4");
        assertTrue(iterator.hasNext());
        assertEquals(iterator.next(), "Ch.iFilm");
        assertTrue(iterator.hasNext());
        assertEquals(iterator.next(), "Ch.HD");
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testFavoritesIterator() {
        String[] fav1 = new String[] {"Ch.iFilm"};
        Iterator<String> iterator = channelsOne.iteratorIfFavorites(fav1);
        assertTrue(iterator.hasNext());
        assertEquals(iterator.next(), "Ch.iFilm");
        assertFalse(iterator.hasNext());

        String[] fav2 = new String[] {"Ch.Nassim", "Ch.HD"};
        iterator = channelsOne.iteratorIfFavorites(fav2);
        assertTrue(iterator.hasNext());
        assertEquals(iterator.next(), "Ch.Nassim");
        assertTrue(iterator.hasNext());
        assertEquals(iterator.next(), "Ch.HD");
        assertFalse(iterator.hasNext());

        String[] fav3 = new String[] {};
        iterator = channelsOne.iteratorIfFavorites(fav3);
        assertFalse(iterator.hasNext());
    }

}
