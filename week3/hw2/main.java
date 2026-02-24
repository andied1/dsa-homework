public class main {
    public static void main(String[] args) {
        
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("S001", "Alice", "Smith", "alice@university.edu", 3.8, "Computer Science", 2));
        manager.addStudent(new Student("S002", "Bob", "Jones", "bob@university.edu", 3.5, "Mathematics", 3));
        manager.addStudent(new Student("S003", "Charlie", "Brown", "charlie@university.edu", 3.9, "Computer Science", 2));

        manager.printAllStudents();
        System.out.println("Average GPA: " + manager.getAverageGpa());
        System.out.println("CS Students: " + manager.getStudentsByMajor("Computer Science").size());

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(new Course("CISC3130", "Data Structures", 3, "Dr. Smith", 30));
        courseManager.addCourse(new Course("MATH101", "Calculus I", 4, "Dr. Johnson", 25));

        EnrollmentManager enrollmentManager = new EnrollmentManager();
        enrollmentManager.enrollStudent("S001", "CISC3130", "Fall 2024");
        enrollmentManager.assignGrade("E001", "A");
        System.out.println("Student GPA: " + enrollmentManager.calculateStudentGpa("S001"));
    }
}
