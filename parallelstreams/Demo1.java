package parallelstreams;

import java.util.Arrays;
import java.util.List;

// 

class Student {
    String name;
    int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }    
}
public class Demo1 {
    public static void main(String[] args) {
        
        List<Student> studentsList = Arrays.asList(
                new Student("David", 82),
                new Student("Bob", 90),
                new Student("John", 65),
                new Student("Canedy", 55),
                new Student("Eric", 85),
                new Student("Smith", 88),
                new Student("Scott", 50)
        );

        // using streams
            studentsList
                        .stream()
                        .filter(student -> student.getScore() >= 80)
                        .limit(3)
                        .forEach(System.out::println);
        
        // using parallel stream    
            studentsList
                        .parallelStream()
                        .filter(student -> student.getScore() >= 80)
                        .limit(3)
                        .forEach(System.out::println);
                        
        // converting streams to parallel streams
            studentsList
                        .stream()
                        .parallel()
                        .filter(student -> student.getScore() >= 80)
                        .limit(3)
                        .forEach(System.out::println);
    }
}
