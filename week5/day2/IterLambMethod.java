import java.util.*;
class IterLambMethod {

    public static void printAll(List<String> list) { //Lambda
        list.forEach(item -> System.out.println(item));
    }

    public static void printAllIterator(List<String> list) { //Iterator
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void removeNum(List<Integer> list, int num) { //Iterator
        Iterator<Integer> it = list.iterator(); 
        while(it.hasNext()) {
            Integer n = it.next();
            if(n == num) {
                it.remove();
        }
        return;
        }
    }

    public static void removeEvenNum(List<Integer> list) { //Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            if(n % 2 == 0) {
                it.remove();
            }
        }
    }

    public static int countEvenNum(List<Integer> list) { //Iterator
        Iterator<Integer> it = list.iterator();
        int count = 0;
        while (it.hasNext()) {
            Integer n = it.next();
            if(n % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void removeOddNum(List<Integer> list) { //Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            if(n % 2 != 0) {
                it.remove();
            }
        }
    }

    public static int countOddNum(List<Integer> list) { //Iterator
        Iterator<Integer> it = list.iterator();
        int count = 0;
        while (it.hasNext()) {
            Integer n = it.next();
            if(n % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void makeUpperCase(List<String> list) { //Lambda
        list.replaceAll(word -> word.toUpperCase());
    }

    public static void makeLowerCase(List<String> list) { //Lambda
        list.replaceAll(word -> word.toLowerCase());
    }

    public static List<String> convertIntToString(List<Integer> list) { //Iterator
        Iterator<Integer> it = list.iterator();
        List<String> strlist = new ArrayList<>();
        while (it.hasNext()) {
            Integer n = it.next();
                strlist.add(String.valueOf(n));
            }
        return strlist;
    }


}
