package binary.schoolapp;

public class Teacher {
    private String teacherName;
    private int teacherID;
    private static int teacherObjCounter = 0;
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
        teacherObjCounter++;
        this.teacherID = teacherObjCounter;
    }
}
