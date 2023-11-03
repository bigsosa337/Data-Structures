import org.w3c.dom.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Deque<Item> implements Iterable<Item> {

    // construct an empty deque
    private Node<Item> first;
    private Node<Item> last;
    private int n;
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
        private Node<Item> prev;
    }

    public Deque() {
        first = null;
        last  = null;
        n = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        return first == null;
    }

    // return the number of items on the deque

    public int size() {
        return n;
    }

    // add the item to the front
    public void addFirst(Item item) {

    }

    // add the item to the back
    public void addLast(Item item) {

    }

    // remove and return the item from the front
    public Item removeFirst() {
        return null;
    }

    // remove and return the item from the back
    public Item removeLast() {
        return null;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return null;
    }

    // unit testing (required)
    public static void main(String[] args) {

    }
}