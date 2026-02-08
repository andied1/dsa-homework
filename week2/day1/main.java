package day1;

public class main {
    public static void main(String[] args) {
        int num[] = {1, 5, 6 ,7, 2, 3};
        bubblesort(num);
        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    
    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int j= i - 1;
            while(j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = k;
            }
        }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int first = arr[i];
            for(int j = 1; j < arr.length - 1; j++) {
                int second = arr[j];
                if(first > second) {
                    int temp = second;
                    arr[i] = second;
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubblesort(int[] arr) {
        boolean swap;
        for(int i = 0; i < arr.length - 1; i++) {
            swap = false;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
               
        } 
    }
