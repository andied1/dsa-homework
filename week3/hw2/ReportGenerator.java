import java.util.*;
public class ReportGenerator {

    public void generatorStudentReport(String studentId, StudentManager sm, EnrollmentManager em) {
        ArrayList<Enrollment> enrollments = em.getEnrollmentsByStudent(studentId);
        if(sm.findStudent(studentId) == null) { System.out.println("Student not in list"); }
    else { 
        System.out.println(sm.findStudent(studentId));
        if(enrollments.isEmpty()) { System.out.println("No enrollments in list"); }
        else {
            for(Enrollment e: enrollments) {
                System.out.println("Course: " + e.getCourseCode() + " " + "Grade: " + e.getGrade());
            }
        }
        System.out.println("Calculated GPA: " + em.calculateStudentGpa(studentId));
    }
    }

    public void generateMajorReport(String major, StudentManager sm) {
        ArrayList<Student> students = sm.getStudentsByMajor(major);
        if(students.isEmpty()) { System.out.println("No students in " + major); }
    else {
        double tot = 0.0;
        for(Student s: students) {
            System.out.println(s);
            tot += s.getGpa();
        }
        System.out.println("Average GPA: " + tot / students.size());
    }
}

    public void generateHonorRollReport(StudentManager sm, double minGPA) {
        ArrayList<Student> honors = sm.getHonorStudents(minGPA);
        if(honors.isEmpty()) { System.out.println("No honor students in list"); }
        else {
            for(Student s: honors) {
                System.out.println(s.getId() + " " + s.getFullName() + " GPA: " + s.getGpa());
            }
        }
    }
}
