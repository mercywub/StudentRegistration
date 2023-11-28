# StudentRegistration
 It allows users to:

1. Register a new student by entering their name, ID, and a list of courses they want to enroll in.
2. Remove an existing student by specifying their ID.
3. Display a list of all registered students, along with their course enrollments.
4. Generate registration slips for all registered students, which summarize their course enrollments.
5. Exit the program.
   The program uses several classes to organize data and functionality. The `Course` class represents a single course, and has fields for the course code, course name, and semester. The `Student` class represents a single student, and has fields for the student's name, ID, and a list of courses they are enrolled in. The `RegistrationSystem` class manages a list of all registered students, and provides methods for registering, removing, displaying, and generating registration slips.

The `main` method in the `Main` class is the entry point of the program. It displays a menu of options to the user, and prompts them to choose an option. Depending on the option chosen, the program will call various methods from the `RegistrationSystem` class to register new students, remove existing students, display information about registered students, or generate registration slips for all registered students.

The program also includes some exception handling to prevent the program from crashing in case the user inputs an incorrect data type. Specifically, the program uses a `try-catch` block to catch and handle any `InputMismatchException` that may occur when the user inputs their choice.
