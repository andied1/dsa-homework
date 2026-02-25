import java.util.*;

public class CourseManager {
    ArrayList<Course> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) { courses.add(course); }

    public Course findCourse(String courseCode) {
        for(Course c: courses) {
            if(c.getCourseCode().equalsIgnoreCase(courseCode)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Course> getCoursesByInstructor(String instructor) {
        ArrayList<Course> instruc = new ArrayList<>();
        for(Course c : courses) {
            if(c.getInstructor().equalsIgnoreCase(instructor)) {
                instruc.add(c);
            }
        }
        return instruc;
    }

    //Did not understand this method much, had online help
    public ArrayList<Course> getAvailableCourses(String studentId, StudentManager studentManager, EnrollmentManager enrollmentManager) {
        ArrayList<Course> avail = new ArrayList<>();
        ArrayList<Enrollment> stuenroll = enrollmentManager.getEnrollmentsByStudent(studentId);
        for(Course course: courses) {
            boolean alreadyEnrolled = false;
            for(Enrollment e: stuenroll) {
                if(!e.getCourseCode().equalsIgnoreCase(course.getCourseCode())) {
                    alreadyEnrolled = true;
                    break;
                }
            }
            if(alreadyEnrolled) continue;
                if(course.getPrerequisites().isEmpty()) {
                    avail.add(course);
                    continue;
                }
                boolean meetsAllPrereqs = true;
                for(String pre: course.getPrerequisites()) {
                    boolean found = false;
                    for(Enrollment e: stuenroll) {
                        if(e.getCourseCode().equalsIgnoreCase(pre) && e.isPassing()) {
                            found=true;
                            break;
                        } 
                    }
                    if(!found) {
                        meetsAllPrereqs = false;
                        break;
                    }
                }
                if(meetsAllPrereqs) {
                    avail.add(course);
                }
        }
        return avail;
    }

    public void printAllCourses() {
        for(Course c: courses) {
            System.out.println(c);
        }
    }

    public int getTotalCourses() {
        return courses.size();
    }
}
