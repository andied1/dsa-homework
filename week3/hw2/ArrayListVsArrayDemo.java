import java.util.*;
public class ArrayListVsArrayDemo {
    public static void main(String[] args) {
        Student s1 = new Student("S001", "Andy", "Huynh", "andy@university.edu", 4, "Computer Science", 2);
        Student s2 = new Student("S002", "James", "He", "james@university.edu", 3, "Mechanical Engineering", 3);
        Student s3 = new Student("S003", "Berry", "Ke", "berry@university.edu", 3, "Chemistry", 2);
        Student s4 = new Student("S004", "Hami", "Ed", "hami@university.edu", 3, "Chemistry", 2);


        //ARRAYLIST
        ArrayList<Student> arrlisstu = new ArrayList<>();
        arrlisstu.add(s1);
        arrlisstu.add(s2);
        arrlisstu.add(s3);
        arrlisstu.add(s4);

        arrlisstu.remove(s1);

        arrlisstu.add(new Student("S005", "Tea", "Ed", "tea@university.edu", 3, "Database Admin", 2)); //Can add or remove any object without returning new list

        //ARRAY
        Student[] arrstu = new Student[3];

        arrstu[0] = s1;
        arrstu[1] = s2;
        arrstu[2] = s3;
        //arrstu[3] = s4; CANNOT ADD ONTO LIST, ALREADY DECLARED SIZE 3
        //ALSO CANNOT REMOVE ELEMENTS IN ARRAY, HAVE TO RETURN NEW ARRAY

        //------------------------------------------------ TIME MEASURE ARRAYLIST

        ArrayList<Student> bigarrlis = new ArrayList<>();

        long startt = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            bigarrlis.add(s1);
        }
        long endt = System.nanoTime();

        System.out.println("Time to add 10,000 Students ArrayList: " + (endt - startt));

        //ACCESS ARRAY LIST
        Random random = new Random();

        startt = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(10000);
            bigarrlis.get(index);
        }

        endt = System.nanoTime();

        System.out.println("Time to access 1,000 Students ArrayList: " + (endt - startt));

        //------------------------------------------------ TIME MEASURE ARRAY

        Student[] bigstu = new Student[10000];

        startt =  System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            bigstu[i] = s1;
        }
        endt = System.nanoTime();

        System.out.println("Time to add 10,000 Students Array: " + (endt - startt));

        //ACCESS ARRAY
        startt = System.nanoTime();

        Student g;
        for(int i = 0; i < 10000; i++) {
            int index = random.nextInt(10000);
            g = bigstu[index];
        }
        endt = System.nanoTime();

        System.out.println("Time to access 1,000 Students Array: " + (endt - startt));
    }
    
}
