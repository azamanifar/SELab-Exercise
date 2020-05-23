package iterator;

import iterator.special.EvenItemsIterator;
import iterator.special.OnlyFavoritesIterator;

import java.util.Iterator;
import java.util.LinkedList;

public class TVChannels extends LinkedList<String> {

    public int i;
	public TVChannels() {
    }

    @Override
    public Iterator<String> iterator() {
        return super.iterator();
    }

    public Iterator<String> iteratorEvenChannels() {
        return new EvenItemsIterator(this);
    }

    public Iterator<String> iteratorIfFavorites(String[] favorites) {
        return new OnlyFavoritesIterator(this, favorites);
    }
	public void newmwthod()
	{
	}
}
