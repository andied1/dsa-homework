import java.util.*;
public class EnrollmentManager {
    ArrayList<Enrollment> enrollments;
    private int nextId = 1;

    public EnrollmentManager() {
        enrollments = new ArrayList<>();
    }

    public void enrollStudent(String studentId, String courseCode, String semester) {
        String enrollmentId = "E" + nextId;
        nextId++;

        Enrollment enrollment = new Enrollment(enrollmentId, studentId, courseCode, null, semester);
        enrollments.add(enrollment);
    }

    public boolean dropEnrollment(String enrollmentId) {
        Enrollment e = findEnrollment(enrollmentId);
        if(e != null) {
            enrollments.remove(e);
            return true;
        }
        return false;
    }

    public Enrollment findEnrollment(String enrollmentId) {
        for(Enrollment e: enrollments) {
            if(e.getEnrollmentId().equals(enrollmentId)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Enrollment> getEnrollmentsByStudent(String studentId) {
        ArrayList<Enrollment> stude = new ArrayList<>();
        for(Enrollment e: enrollments) {
            if(e.getStudentId().equalsIgnoreCase(studentId)) {
                stude.add(e);
            }
        }
        return stude;
    }

    public ArrayList<Enrollment> getEnrollmentsByCourse(String courseCode) {
        ArrayList<Enrollment> cours = new ArrayList<>();
        for(Enrollment e: enrollments) {
            if(e.getCourseCode().equalsIgnoreCase(courseCode)) {
                cours.add(e);
            }
        }
        return cours;
    }

    public void assignGrade(String enrollmentId, String grade) {
        Enrollment e = findEnrollment(enrollmentId);
        if(e == null) {
            System.out.println("Enrollment not found");
            return;
        }
        if(grade.equals("A") || 
        grade.equals("B") ||
        grade.equals("C") ||
        grade.equals("D")) {
            e.setGrade(grade);
    }
    }

    public double calculateStudentGpa(String studentID) {
        ArrayList<Enrollment> list = getEnrollmentsByStudent(studentID);
        if(list.isEmpty()) { return 0.0; }
        double tot = 0.0;
        int count = 0;
        for(Enrollment e: list) {
            if(e.getGrade() != null) {
                tot += e.getGradePoints();
                count++;
            }
        }
        return tot / count;
    }

    public ArrayList<String> getStudentsInCourse(String courseCode) {
        ArrayList<String> idcourse = new ArrayList<>();
        for(Enrollment e: enrollments) {
            if(e.getCourseCode().equalsIgnoreCase(courseCode)) {
                idcourse.add(e.getStudentId());
            }
        }
        return idcourse;
    }

    public void printAllEnrollments() {
        for(Enrollment e: enrollments) {
            System.out.println(e);
        }
    }

}
