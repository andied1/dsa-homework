package week3;
import java.util.*;

public class VectorUtils <T> {

    public static <T> void swap(Vector<T> vec, int index1, int index2) {
        T temp = vec.get(index1);
        vec.set(index2, temp);
        vec.set(index1, vec.get(index2));
    }

    public static <T extends Comparable<T>> T findMax(Vector<T> vec) {
        T max = vec.get(0);
        for(int i = 1; i < vec.size(); i++) {
            if(vec.get(i).compareTo(max) > 0) {
                max = vec.get(i);
            }
        }
        return max;
        }

    public static <T> int countMatches(Vector<T> vec, T target) {
        int match = 0;
        for(int i = 0; i < vec.size(); i++) {
            if(vec.get(i).equals(target)) {
                match++;
            }
        }
        return match;
    }

    public static Vector<Product> filterProducts(Vector<Product> vec, String category) {
        Vector<Product> filter = new Vector<>();
        for(Product p : vec) {
            if(p.getCategory().equalsIgnoreCase(category)) {
                filter.add(p);
            }
        }
        return filter;
    }
    
    public static <T extends Number> double sumNumbers(Vector<T> numbers) {
        double tot = 0.0;
        for(T t : numbers) {
            tot += t.doubleValue();
        }
        return tot;
    }

    public static <T extends Number> double averageNumbers(Vector<T> numbers) {
        double avg = 0.0;
        for(T t : numbers) {
            avg += t.doubleValue();
        }
        return avg/numbers.size();
    }

    
    }
    
