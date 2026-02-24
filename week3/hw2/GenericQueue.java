import java.util.*;
public class GenericQueue<T> {
    private ArrayList<T> que;

    GenericQueue() { que = new ArrayList<>(); }

    public void enqueue(T item) { que.add(item); }

    public T dequeue() { return que.remove(0); }

    public T peek() { return que.get(0); }

    public boolean isEmpty() { return que.isEmpty(); }

    public int size() { return que.size(); }

    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();
queue.enqueue(10);
queue.enqueue(20);
System.out.println(queue.dequeue());  // 10
    }
}
