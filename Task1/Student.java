package Laba4.Task1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Comparable<Student> {
    protected String name;
    protected String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public int compareTo(Student o) {
        return course.compareTo(o.course) ;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> students, String course) {
        System.out.println("Студенты " + course + " курса:");

        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if (Objects.equals(student.getCourse(), course)) {
                System.out.println(student.getName());
            }
        }
    }

    public static void intersect(LinkedList set1, LinkedList set2) {
        Set<Integer> intersect = (Set<Integer>) set1.stream().filter(set2::contains).collect(Collectors.toSet());
        System.out.println("intersect "+intersect);

    }

    public static void union(LinkedList set1, LinkedList set2) {
        Set<Integer> union = (Set<Integer>) Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
        System.out.println("union "+union);
    }


}
