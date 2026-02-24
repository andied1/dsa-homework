import java.util.*;
public class ArrayListUtils<T>{
    public static <T> void swap(ArrayList<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static <T extends Comparable<T>> T findMax(ArrayList<T> list) {
        T max = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static <T extends Student> ArrayList<T> filterGeneric(ArrayList<T> students, String major) {
        ArrayList<T> maj = new ArrayList<>();
        for(T s: students) {
            if(s.getMajor().equalsIgnoreCase(major)) {
                maj.add(s);
            }
        }
        return maj;
    }

    public static <T> void reverse(ArrayList<T> list) {
        list.reversed();
    }

    public static <T> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> newmerge = new ArrayList<>(list1);
        newmerge.addAll(list2);
        return newmerge;
    }

    public static <T extends Number> double sum(ArrayList<T> numbers) {
        double tot = 0.0;
        for(T n: numbers) {
        tot += n.doubleValue();
        }
        return tot;
    }

    public static <T extends Number> double average(ArrayList<T> numbers) {
        return sum(numbers) / numbers.size();
    }

    public static <T extends Number & Comparable<T>> ArrayList<T> filterAbove(ArrayList<T> numbers, T threshold) {
        ArrayList<T> great = new ArrayList<>();
        for(T n: numbers) {
            if(n.compareTo(threshold) > 0) {
                great.add(n);
            }
        }
        return great;
    }

    public static double sumNumbers(ArrayList<? extends Number> numbers) {
        double tot = 0.0;
        for(Number n: numbers) {
            tot += n.doubleValue();
        }
        return tot;
    }

    public static void addNumbers(ArrayList<? super Integer> list) {
        list.add(5);
        list.add(10);
        list.add(15);
    }

    public static void printList(ArrayList<?> list) {
        for(Object obj : list) {
            System.out.print(obj + " ");
        }
    }

    //************TEST
    public static void main(String[] args) {
        ArrayList<Integer> intlist = new ArrayList<>();
        intlist.add(1);
        intlist.add(2);
        intlist.add(3);

        ArrayList<Double> doublist = new ArrayList<>();
        doublist.add(1.5);
        doublist.add(2.5);
        doublist.add(3.5);        

        System.out.println("Sum int: " + sum(intlist));
        System.out.println("Sum double: " + sum(doublist));
        System.out.println("");

        addNumbers(intlist);
        //addNumbers(doublist); Cannot add Ints
        
        System.out.println("Adding Sum int with int: " + intlist);
        //System.out.println("Adding Sum double with int: " + doublist); Cannot add Ints

        System.out.println("");
        System.out.println("Int list printed");
        printList(intlist);
        System.out.println("");
        System.out.println("Double list printed");
        printList(doublist);
        System.out.println("");
        System.out.println("");


        System.out.println("Should use Upper Bound wildcard when reading from a given list, not adding values");
        System.out.println("Should use Lower Bound wildcard when adding onto a list but careful with which types");
        System.out.println("Should use Unbounded wildcard when dealing with objects, or printing");


    }
 
}