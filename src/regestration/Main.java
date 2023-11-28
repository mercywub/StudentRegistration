package regestration;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RegistrationSystem registrationSystem = new RegistrationSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELL COME TO HARAMAYA UNIVERSTY");
        System.out.println("***************************************************");
        System.out.println("******************************************************");

        while (true) {
            System.out.println("1. Register Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Generate Registration Slips");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();

                    Student student = new Student(name, id);

                    System.out.print("Enter the number of courses: ");
                    int numOfCourses = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 1; i <= numOfCourses; i++) {
                        System.out.println("Enter Course " + i + " details:");

                        System.out.print("Course Code: ");
                        String courseCode = scanner.nextLine();

                        System.out.print("Course Name: ");
                        String courseName = scanner.nextLine();

                        System.out.print("Semester: ");
                        int semester = scanner.nextInt();
                        scanner.nextLine();

                        Course course = new Course(courseCode, courseName, semester);
                        student.addCourse(course);
                    }

                    registrationSystem.addStudent(student);
                    System.out.println("Student");

            }
        }
    }
}
