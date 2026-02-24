import java.util.Objects;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private double gpa;
    private String major;
    private int year;

    public Student(String studentId, String firstName, String lastName, String email, double gpa, String major, int year) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gpa = gpa;
        this.major = major;
        this.year = year;
    }

    public String getId() { return studentId; }
    public void setId(String studentId) { this.studentId = studentId; }

    public String getFirst() { return firstName; }
    public void setFirst(String firstName) { this.firstName = firstName; }

    public String getLast() { return lastName; }
    public void setLast(String lastName) {this.lastName = lastName; }

    public String getMail() { return email; }
    public void setMail(String email) { this.email = email; } 

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) {this.gpa = gpa; }

    public String getMajor() { return major; }
    public void setMajor(String major) {this.major = major; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getFullName() { return firstName + " " + lastName; }
    
    @Override
    public String toString() {
        return studentId + " " + firstName + " " + lastName + " " + email + " " + gpa + " " + major + " " + year;
        }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
