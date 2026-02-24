import java.util.*;
public class StudentManager {
    ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if(findStudent(student.getId()) == null) {
            students.add(student);
        }
        else {
            System.out.println("Student already in list");
        }
    }

    public boolean removeStudent(String studentId) {
        Student student = findStudent(studentId);
        if(student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }

    public Student findStudent(String studentId) {
        for(Student s : students) {
            if(s.getId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Student> getStudentsByMajor(String major) {
        ArrayList<Student> newmajor = new ArrayList<>();
        for(Student s: students) {
            if(s.getMajor().equalsIgnoreCase(major)) {
                newmajor.add(s);
            }
        }
        return newmajor;
    }

    public ArrayList<Student> getStudentsByYear(int year) {
        ArrayList<Student> newyear = new ArrayList<>();
        for(Student s: students) {
            if(s.getYear() == year) {
                newyear.add(s);
            }
        }
        return newyear;
    }

    public ArrayList<Student> getHonorStudents(double minGpa) {
        ArrayList<Student> honors = new ArrayList<>();
        for(Student s: students) {
            if(s.getGpa() >= minGpa) {
                honors.add(s);
            }
        }
        return honors;
    }

    public double getAverageGpa() {
        double avggpa = 0.0;
        for(Student s: students) {
            avggpa += s.getGpa();
        }
        return avggpa/students.size();
    }

    public double getAverageGpaByMajor(String major) {
        double avggpa = 0.0;
        ArrayList<Student> newmaj = getStudentsByMajor(major);
        for(Student s: newmaj) {
            avggpa += s.getGpa();
        }
        return avggpa/newmaj.size();
    }

    public void printAllStudents() {
        System.out.println("Student ID      Student           Year            Major              Gpa");
        System.out.println("-------------------------------------------------------------------------");
        for(Student s: students) {
        System.out.printf("%-15s %-18s %-10d %-22s %.2f\n", s.getId(), s.getFullName(), s.getYear(), s.getMajor(), s.getGpa());
        }
    }

    public int getTotalStudents() {
        return students.size();
    }

    public ArrayList<String> getAllMajors() {
        ArrayList<String> unimaj = new ArrayList<>();
        for(Student s: students) {
            String maj = s.getMajor();
                if(!unimaj.contains(maj)) {
                    unimaj.add(maj);
                }
        }
        return unimaj;
    }
}
