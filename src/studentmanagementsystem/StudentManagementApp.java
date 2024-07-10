package studentmanagementsystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StudentManagementApp {
    private List<Student> studentList;
    public StudentManagementApp() {
        this.studentList = new ArrayList<>();
    }
   public void addStudent(Student student){
        studentList.add(student);
        System.out.println(student+"Added student ");
    }
       public void sortStudentsByName() {
           Collections.sort(studentList, (s1, s2) -> s1.getStudentName().compareTo(s2.getStudentName()));
           System.out.println("Students sorted by name.");
       }
public Student searchStudentByID(String studentID) {
    for (Student student : studentList) {
        if (student.getStudentId().equals(studentID)) {
            System.out.println("Student found: " + student);
            return student;
        }
    }
    System.out.println("Student with ID " + studentID + " not found.");
    return null;
}
public void displayStudents() {
    if (studentList.isEmpty()) {
        System.out.println("Student list is empty.");
    } else {
        System.out.println("List of Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

    public static void main(String[] args) {
        StudentManagementApp app=new StudentManagementApp();
        app.addStudent(new Student("1", "shravani"));
        app.addStudent(new Student("2", "soujanya"));
        app.addStudent(new Student("3", "chikitha"));
        app.displayStudents();
        app.sortStudentsByName();
        app.searchStudentByID("2");
        app.searchStudentByID("3");
        app.displayStudents();


    }
}
