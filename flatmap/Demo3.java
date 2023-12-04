package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// FlatMap Method | Map Vs FlatMap | Hands-On

class Student {
    String studentName;
    int studenId;
    char studentGrade;

    public Student(String studentName, int studenId, char studentGrade) {
        this.studentName = studentName;
        this.studenId = studenId;
        this.studentGrade = studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudenId() {
        return studenId;
    }

    public void setStudenId(int studenId) {
        this.studenId = studenId;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(char studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studenId=" + studenId + ", studentGrade=" + studentGrade
                + "]";
    }
}

public class Demo3 {
    public static void main(String[] args) {

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Smith", 101, 'A'));
        studentList1.add(new Student("John", 102, 'B'));
        studentList1.add(new Student("Kenedy", 103, 'C'));
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Scott", 104, 'A'));
        studentList2.add(new Student("Mary", 105, 'B'));
        studentList2.add(new Student("Kitty", 106, 'C'));

        List<List<Student>> studenList = Arrays.asList(studentList1, studentList2);

        List<String> nameList = studenList
                .stream()
                .flatMap(students -> students.stream())
                .map(student -> student.getStudentName())
                .collect(Collectors.toList());
        System.out.println(nameList);
    }
}
