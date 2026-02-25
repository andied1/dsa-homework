import java.util.*;
public class StudentManagementSystemMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        ReportGenerator report = new ReportGenerator();

        //STUDENT MANAGER
        studentManager.addStudent(new Student("S001", "Alice", "Smith", "alice@university.edu", 3.8, "Computer Science", 2));
        studentManager.addStudent(new Student("S002", "Jake", "Mits", "jake@university.edu", 2.5, "Mechanical Engineering", 3));
        studentManager.addStudent(new Student("S003", "Mike", "English", "mike@university.edu", 3.5, "Cyber Security", 3));
        studentManager.addStudent(new Student("S004", "Andrei", "Markaski", "andrei@university.edu", 4, "Mechanical Engineering", 3));
        studentManager.addStudent(new Student("S005", "Andy", "Huynh", "andy@university.edu", 3.4, "Computer Science", 2));
        studentManager.addStudent(new Student("S006", "Ramin", "Rashid", "ramin@university.edu", 3.5, "Computer Science", 3));
        studentManager.addStudent(new Student("S007", "Chloe", "Huang", "chloe@university.edu", 3, "Chemistry", 2));
        studentManager.addStudent(new Student("S008", "Will", "Smith", "will@university.edu", 3.4, "Nursing", 4));
        studentManager.addStudent(new Student("S009", "Mice", "Li", "mice@university.edu", 3.8, "Computer Science", 2));
        studentManager.addStudent(new Student("S010", "Bryce", "Joe", "joe@university.edu", 1, "Marketing", 2));
        studentManager.printAllStudents();
        System.out.println("");

        //COURSE MANAGER
        Course c1 = new Course("MATH102", "Calculus 2", 4, "Dr. Mitch", 30);
        courseManager.addCourse(new Course("CISC3130", "Data Structures", 3, "Dr. Smith", 30));
        courseManager.addCourse(new Course("MATH101", "Calculus 1", 3, "Dr. Brine", 30));
        courseManager.addCourse(c1);
        courseManager.addCourse(new Course("CISC3310", "Computer Architecture", 4, "Ms. Briskman", 30));
        courseManager.addCourse(new Course("CHIN1010", "Chinese", 3, "Ms. Wei", 30));
        courseManager.printAllCourses();
        c1.addPrerequisite("MATH101"); //Prerequisite adding
        System.out.println("");

        //ENROLLMENT MANAGER
        enrollmentManager.enrollStudent("S001", "CISC3130", "Fall 2024");
        enrollmentManager.enrollStudent("S002", "MATH102", "Fall 2024");
        enrollmentManager.enrollStudent("S003", "CHIN1010", "Fall 2024");
        enrollmentManager.enrollStudent("S004", "MATH101", "Fall 2024");
        enrollmentManager.printAllEnrollments();
        System.out.println("");

        //GRADE ASSIGN
        enrollmentManager.assignGrade("E001", "B");
        enrollmentManager.assignGrade("E002", "A");

        //GPA calculations
        System.out.println("Student Manager: Average GPA: " + studentManager.getAverageGpa());
        System.out.println("Mechanical Engineering: Average GPA: " + studentManager.getAverageGpaByMajor("Mechanical Engineering"));
        System.out.println("");
        System.out.println("Calculate Student GPA S001: " + enrollmentManager.calculateStudentGpa("S001"));
        System.out.println("");
        System.out.println("S004 Available Courses with prerequisite: " + courseManager.getAvailableCourses("S004", studentManager, enrollmentManager));
        System.out.println("");

        //REPORTING
        System.out.println("Honor Students with 3.5+ Report: ");
        report.generateHonorRollReport(studentManager, 3.5);
        System.out.println("");
        System.out.println("Report of Mechanical Engineering: ");
        report.generateMajorReport("Mechanical Engineering", studentManager);
        System.out.println("");
        System.out.println("Report of Student S001: ");
        report.generatorStudentReport("S001", studentManager, enrollmentManager);
        System.out.println("");

        /* 
        //GENERICS
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(10);
        num.add(15);
        System.out.println("Sum: " + ArrayListUtils.sum(num));
        System.out.println("Average: " + ArrayListUtils.average(num));
        System.out.println("Above 9: " + ArrayListUtils.filterAbove(num, 9));
        //QUEUE
        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        */
    }
}
