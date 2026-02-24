import java.util.*;
public class GenericStack<T> {
    private ArrayList<T> stack;

    GenericStack() { stack = new ArrayList<>(); }

    public void push(T item) { stack.add(item); }

    public T pop() { return stack.remove(stack.size()-1); }

    public T peek() { return stack.get(stack.size() -1); }

    public boolean isEmpty() { return stack.isEmpty(); }

    public int size() { return stack.size(); }

    public void clear() { stack.clear(); }
}
