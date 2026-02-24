import java.util.*;
public class ArrayListOperationsDemo {
    public static void main(String[] args) {
    Student[] s = {new Student("S001", "Alice", "Smith", "alice@university.edu", 3.8, "Computer Science", 2),
                    new Student("S002", "Bob", "Jones", "bob@university.edu", 3.5, "Mathematics", 3)
                };
    
    ArrayList<Student> stuarrlist = new ArrayList<>(Arrays.asList(s));

    System.out.println("Before Adding");
    for(Student a: stuarrlist) {
        System.out.println(a);
    }
    System.out.println("");

    stuarrlist.add(new Student("S003", "Charlie", "Brown", "charlie@university.edu", 3.9, "Computer Science", 2));

    System.out.println("After Adding");
    for(Student a: stuarrlist) {
        System.out.println(a);
    }
    System.out.println("");
System.out.println("-----------------------------------------------");

    ArrayList<Student> secarrlist = new ArrayList<>();
    secarrlist.add(new Student("S001", "Jake", "Smith", "jake@university.edu", 3.8, "Nursing", 2));
    secarrlist.add(new Student("S002", "Bree", "Jones", "bree@university.edu", 3.5, "Mathematics", 3));

    Student[] s2 = secarrlist.toArray(new Student[0]);
    System.out.println("Array List");
    for(Student a: secarrlist) {
        System.out.println(a);
    }
    System.out.println("");

    System.out.println("Array");
    for(Student a: s2) {
        System.out.println(a);
    }
    System.out.println("");
System.out.println("-----------------------------------------------");

    ArrayList<Student> subarrlist = new ArrayList<>();
    subarrlist.add(new Student("S001", "Matt", "Pat", "matt@university.edu", 4, "Computer Science", 3));
    subarrlist.add(new Student("S002", "Ben", "Ted", "ben@university.edu", 2, "Computer Science", 2));
    System.out.println("Before Sublist");
    for(Student a: subarrlist) {
        System.out.println(a);
    }
    System.out.println("");

    subarrlist.subList(0, 1);
    System.out.println("After Sublist");
    for(Student a: secarrlist) {
        System.out.println(a);
    }
    System.out.println("");
System.out.println("-----------------------------------------------");

    Collections.sort(stuarrlist, Comparator.comparingDouble(Student::getGpa).reversed());

    Collections.sort(stuarrlist, Comparator.comparing(Student::getLast));

System.out.println("-----------------------------------------------");

    ArrayList<Student> newlis = new ArrayList<>();
    Student s4 = new Student("S001", "Lisa", "Smith", "lisa@university.edu", 3.8, "Computer Science", 2);
    Student s5 = new Student("S002", "Jerry", "Jones", "jerry@university.edu", 3.5, "Mathematics", 3);

    newlis.add(s4);
    newlis.add(s5);
    int index = newlis.indexOf(s4); // Find Student
    newlis.contains(s5); // Contains

    Collections.sort(newlis, Comparator.comparing(Student::getId));
    int binaryi = Collections.binarySearch(newlis, s4, Comparator.comparing(Student::getId));
    System.out.println("Binary search Index: " + binaryi);

    for(Student b : newlis) {
        System.out.println(b);
    }

        }
}
