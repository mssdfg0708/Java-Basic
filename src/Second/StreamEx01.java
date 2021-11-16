package Second;

import java.util.*;
import java.util.stream.*;

public class StreamEx01 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Dave1", 3, 300),
                new Student("Dave2", 3, 200),
                new Student("Dave3", 3, 100),
                new Student("Dave4", 2, 300),
                new Student("Dave5", 2, 200),
                new Student("Dave6", 2, 50),
                new Student("Dave7", 1, 300),
                new Student("Dave8", 1, 150),
        };

        Stream<Student> studentStream = Stream.of(students);
        studentStream.sorted(Comparator.comparing(Student::getDepart).
                thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
        System.out.println();

        studentStream = Stream.of(students);
        IntStream studentScoreStream = studentStream.mapToInt(Student::getTotalScore);

        IntSummaryStatistics statistics = studentScoreStream.summaryStatistics();
        System.out.println("count : " + statistics.getCount());
        System.out.println("sum : " + statistics.getSum());
        System.out.printf("average : %.2f \n", statistics.getAverage());
        System.out.println("min : " + statistics.getMin());
        System.out.println("max : " + statistics.getMax());
    }
}

class Student implements Comparable<Student> {
    String name;
    int depart;
    int totalScore;

    Student (String name, int depart, int totalScore) {
        this.name = name;
        this.depart = depart;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("%s, %d, %d", name, depart, totalScore).toString();
    }

    String getName() { return name; }
    int getDepart() { return depart; }
    int getTotalScore() { return totalScore; }

    @Override
    public int compareTo(Student student) {
        return student.totalScore - this.totalScore;
    }
}
