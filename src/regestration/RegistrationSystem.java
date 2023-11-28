package regestration;
import java.util.List;
import java.util.ArrayList;
class RegistrationSystem {
    private List<Student> students;

    public RegistrationSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students have been registered.");
        } else {
            for (Student student : students) {
                System.out.println("----------------------------------");
                System.out.println("Name: " + student.getName());
                System.out.println("ID: " + student.getId());
                System.out.println("Courses:");
                for (Course course : student.getCourses()) {
                    System.out.println("Course Code: " + course.getCourseCode());
                    System.out.println("Course Name: " + course.getCourseName());
                    System.out.println("Semester: " + course.getSemester());
                    System.out.println("-----------------------------");
                }
                System.out.println("----------------------------------");
            }
        }
    }

    public void generateRegistrationSlips() {
        if (students.isEmpty()) {
            System.out.println("No students have been registered.");
        } else {
            for (Student student : students) {
                System.out.println("----------------------------------");
                System.out.println("Registration Slip for " + student.getName());
                System.out.println("ID: " + student.getId());
                System.out.println("Courses:");
                for (Course course : student.getCourses()) {
                    System.out.println("Course Code: " + course.getCourseCode());
                    System.out.println("Course Name: " + course.getCourseName());
                    System.out.println("Semester: " + course.getSemester());
                    System.out.println("-----------------------------");
                }
                System.out.println("----------------------------------");
            }
        }
    }
}
