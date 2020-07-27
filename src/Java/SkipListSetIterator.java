package Java;

import java.util.Iterator;
import java.util.function.Consumer;

public class SkipListSetIterator <T extends Comparable<T>> implements Iterator<T>
{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {

    }
}
