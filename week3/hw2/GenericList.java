import java.util.*;
public class GenericList <T>{
    ArrayList<T> items;
    GenericList() {items = new ArrayList<>();}

    public void add(T item) { items.add(item); }

    public T get(int index) { return items.get(index); }

    public boolean remove(T item) {
        if(items.contains(item)) {
            items.remove(item);
            return true;
        }
        return false;
    }

    public int size() { return items.size(); }

    public boolean isEmpty() { return items.isEmpty(); }

    public void clear() { items.clear(); }

    public boolean contains(T item) { return items.contains(item); }

    public ArrayList<T> getAll() {
        ArrayList<T> newarr = new ArrayList<>(items);
        return newarr;
    }

    public void addAll(ArrayList<T> other) { items.addAll(other); }

    public <U extends T> void addAllFrom(GenericList<U> other) {
        for(int i = 0; i < other.size(); i++) {
            items.add(other.get(i));
        }
    }
}
