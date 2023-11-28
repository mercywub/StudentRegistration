package regestration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course {
    private String courseCode;
    private String courseName;
    private int semester;

    public Course(String courseCode, String courseName, int semester) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.semester = semester;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getSemester() {
        return semester;
    }
}
