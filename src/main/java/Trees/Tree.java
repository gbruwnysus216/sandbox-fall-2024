package Trees;

import java.util.Iterator;

public interface Tree<T> extends Iterable<T> {

    boolean create();
    T insert(T element);
    T search(T tagertElement); throws ElementNotFoundException;
    boolean delete(T targetElement);
    boolean contains(T targetElement);
    boolean isEmpty();
    int size();

    Iterator<T> iterator();
    Iterator<T> iteratorPreOrder();
    Iterator<T> iteratorInOrder();
    Iterator<T> iteratorPostOrder();
    Iterator<T> iteratorLevelOrder();



}
