package day2;
public class start {
    public static void main(String[] args) {
        intprinter.printtype("wajdisa"); 
    }
}

class intprinter <T> {
    intprinter(){}

    public static <T> void printtype(T type) {
        System.out.println(type);
    }
}