package binary.schoolapp;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Scanner;

public class School {
    Scanner input = new Scanner(System.in);
    // Storage
    private LinkedList<Course> courses = new LinkedList<>();
    private LinkedList<Teacher> teachers = new LinkedList<>();
    private LinkedList<Student> registeredStudents = new LinkedList<>();

    public void addCourse() {
        System.out.println("Enter the course you would like to add !");
        String courseName = input.nextLine();
        Course course = new Course(courseName);
        this.courses.add(course);
        System.out.println(courseName + " successfully added!");
    }
    public void registerStudent() {
        System.out.println("Enter the name of the student !");
        String studentName = input.nextLine();
        Student student = new Student(studentName);
        this.registeredStudents.add(student);
        System.out.println("Successfully added " + studentName);
    }

    public void registerTeacher() {
        System.out.println("Enter teachers name !");
        String teacherName = input.nextLine();
        Teacher teacher = new Teacher(teacherName);
        this.teachers.add(teacher);
        System.out.println("Successfully added " + teacherName);
    }

    public void assignTeacherToStudent() {
        System.out.println("Enter existing student ID :");
        int studentID = input.nextInt();
        System.out.println("Enter existing teacher ID :");
        int teacherID = input.nextInt();

        for (int i = 0; i < this.registeredStudents.size(); i++) {
            if (this.registeredStudents.get(i).getStudentID() == studentID) {
                this.registeredStudents.get(i).setAssignedTeacherID(teacherID);
                System.out.println("Successfully assigned a teacher to " + this.registeredStudents.get(i).getStudentName());
                break;
            }
        }
    }

    public void assignCourseToStudent() {
        System.out.println("Enter the course ID: ");
        int courseID = input.nextInt();
        System.out.println("Enter the student's student ID");
        int studentID = input.nextInt();

        for (int i = 0; i < this.registeredStudents.size(); i++) {
            if (this.registeredStudents.get(i).getStudentID() == studentID) {
                this.registeredStudents.get(i).setAssignedCourseID(courseID);
                System.out.println("Successfully added course to the student!");
                break;
            }
        }
    }

    public void showAllStudents() {
        for (int i = 0; i < this.registeredStudents.size(); i++) {
            System.out.println(this.registeredStudents.get(i).getStudentName());
        }
    }

    public void showAllTeachers() {
        for (int i = 0; i < this.teachers.size(); i++) {
            System.out.println(this.teachers.get(i).getTeacherName());
        }
    }

    public void showAllCourses() {
        for(int i = 0; i < this.courses.size(); i++) {
            System.out.println(this.courses.get(i).getCourseName());
        }
    }

    public static void main(String[] args) {
        School binary = new School();
        binary.addCourse();
        binary.registerStudent();
        binary.registerStudent();
        binary.registerStudent();
        binary.registerStudent();
        binary.registerStudent();


        binary.showAllStudents();

    }
}
