package week3;
import java.util.*;

public class VectorComparisonDemo {
    public static void main(String[] args) {
        Vector<Product> vPro = new Vector<>();
        ArrayList<Product> arrPro = new ArrayList<>();

        Product pro1 = new Product("0000", "Product", "Clothing", 5.0, 10, "Dell");

        long startv = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            vPro.add(pro1);
        }
        long endv = System.nanoTime();

        long durav = endv - startv;
        System.out.println("Vector 10,0000 time: " + durav);
        System.out.println("");

        long startarr = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            arrPro.add(pro1);
        }
        long endarr = System.nanoTime();

        long duraarr = endarr - startarr;
        System.out.println("Arraylist 10,0000 time: " + duraarr);
        System.out.println("");

        Random rand = new Random();
        long startvrand = System.nanoTime();
        for(int i = 0; i < 1000; i++) {
            vPro.get(rand.nextInt(vPro.size()));
        }
        long endvrand = System.nanoTime();
        long duravrand = endvrand - startvrand;
        System.out.println("Vector 1,000 access time: " + duravrand);
        System.out.println("");

        long startarand = System.nanoTime();
        for(int i = 0; i < 1000; i++) {
            arrPro.get(rand.nextInt(arrPro.size()));
        }
        long endarand = System.nanoTime();
        long duraarand = endarand - startarand;
        System.out.println("Arraylist 1,000 access time: " + duraarand);
        System.out.println("");

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        Vector<Product> vMemory = new Vector<>();

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        for(int i = 0; i < 10000; i++) {
            vMemory.add(pro1);
        }
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long vectorMemoryUsed = memoryAfter - memoryBefore;
        System.out.println("Vector Memory: " + vectorMemoryUsed);
        runtime.gc();

        System.out.println("");

        memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        ArrayList<Product> arrMemory = new ArrayList<>();
        for(int i = 0; i < 10000; i++) {
            arrMemory.add(pro1);
        }
        long memoryAfterArr = runtime.totalMemory() - runtime.freeMemory();
        long arrMemUsed = memoryAfterArr - memoryBefore;
        System.out.println("ArrayList Memory: " + arrMemUsed);
    }

    //Performance
    //I notice that putting products in vector takes longer than array list, and so is accessing vector is longer than array list.
    //Vector also uses a lot more memory than arraylist

    //Vector over Arraylist
    //I would choose vector if thread safety is required where all methods are in sync and I would use it on legacy code.

    //Arraylist over Vector
    //Mostly used now over vector nowadays. For better performance in speed and memory, thread safety also not required.
    //Compared to vectors, arraylist is more new and is more of a first thing approach in arrays.

    
}
