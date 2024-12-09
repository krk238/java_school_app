package binary.schoolapp;

import java.util.LinkedList;

public class Course {

    private String courseName;
    private static int courseObjCounter = 0;
    private int courseID;
    public Course(String courseName) {
        this.courseName = courseName;
        courseObjCounter++;
        this.courseID = courseObjCounter;
    }
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
