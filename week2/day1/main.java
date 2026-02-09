package day1;
import java.util.*;

public class main {
    public static void main(String[] args) {

        int[] rand = random(100);
        int[] rand2 = random(100);
        int[] rand3 = random(100);

        selectionSort(rand);
        bubblesort(rand2);
        insertionSort(rand3);
        
        /* 
        System.out.println(Arrays.toString(rand)); 
        System.out.println("");
        System.out.println(Arrays.toString(rand2));
        System.out.println("");
        System.out.println(Arrays.toString(rand3));
        System.out.println("");
        
        Display arrays
        */
    }

    public static int[] reverse(int n) {
        int[] r = new int[n];
        for(int i = n; i > 0; i--) {
            r[i-1] = i;
        }
        return r;
    }

    public static int[] increasing(int n) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = i;
        }
        return a;
    }

    public static int[] random(int n) {
        int[] ra = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++) {
            ra[i] = r.nextInt(100) + 1;
        }
        return ra;
    }
    
    public static void insertionSort(int arr[]) {
        int countswap = 0;
        int countcomp = 0;
        for(int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int j= i - 1;
            while(j >= 0 && arr[j] > k) {
                countcomp++;
                countswap++;
                arr[j + 1] = arr[j];
                j--;
            }
            if(j >= 0) { // Failed comparison
                countcomp++;
            }
            arr[j+1] = k;
            }
            System.out.println("Insertion sort swaps: " + countswap);
            System.out.println("Insertion sort comparisons: " + countcomp);
        }

    public static void selectionSort(int[] arr) {
        int countswap = 0;
        int countcomp = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            int minInd = i;
            for(int j = i+1; j < arr.length; j++) {
                countcomp++;
                if(arr[minInd] > arr[j]) {
                    minInd = j;
                }
            }
            if(minInd != i) {
                countswap++;
                int temp = arr[i];
                arr[i] = arr[minInd];
                arr[minInd] = temp;
            }
        }
        System.out.println("Selection sort swaps: " + countswap);
        System.out.println("Selection sort comparisons: " + countcomp);
    }

    public static void bubblesort(int[] arr) {
        int countswap = 0;
        int countcomp = 0;
        boolean swap;
        for(int i = 0; i < arr.length - 1; i++) {
            swap = false;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                countcomp++;
                if(arr[j] > arr[j + 1]) {
                    countswap++;
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        System.out.println("Bubble sort swaps: " + countswap);
        System.out.println("Bubble sort comparisons: " + countcomp);
        } 
    }
