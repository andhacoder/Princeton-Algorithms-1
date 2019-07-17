import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{
    //...
    public Iterator<Item> iterator{
        return new ListIterator();
    }
    
    private class ListIterator implements Iterator<item>{
        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
