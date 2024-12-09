package binary.schoolapp;

public class Student {
    private String studentName;
    private int assignedTeacherID;
    private int assignedCourseID;
    private static int studentObjCounter = 0;
    private int studentID;

    // --------------------------------------------------------- //
    public int getAssignedCourseID() {
        return assignedCourseID;
    }

    public void setAssignedCourseID(int assignedCourseID) {
        this.assignedCourseID = assignedCourseID;
    }

    public Student(String studentName) {
        this.studentName = studentName;
        studentObjCounter++;
        this.studentID = studentObjCounter;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAssignedTeacherIDr() {
        return assignedTeacherID;
    }
    public void setAssignedTeacherID(int assignedTeacher) {
        this.assignedTeacherID = assignedTeacher;
    }
}
