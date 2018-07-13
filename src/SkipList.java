import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public class SkipList<E extends Comparable<E>> extends AbstractSequentialList<E> implements List<E>, Cloneable, Serializable{
    @Override
    public int size(){
        return 0;
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        return null;
    }
}