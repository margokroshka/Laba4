package Laba4.Task1;

import java.util.ArrayList;
import java.util.LinkedList;

import static Laba4.Task1.Student.intersect;
import static Laba4.Task1.Student.printStudents;
import static Laba4.Task1.Student.union;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Student st1 = new Student("3", "Гребенщиков");
        students.add(st1);
        Student st2 = new Student("2", "Васильев");
        students.add(st2);
        Student st3 = new Student("3", "Шахрин");
        students.add(st3);
        Student st4 = new Student("1", "Шевчук");
        students.add(st4);
        Student st5 = new Student("3", "Чиграков");
        students.add(st5);
        Student st6 = new Student("2", "Бутусов");
        students.add(st6);
        Student st7 = new Student("1", "Цой");
        students.add(st7);
        Student st8 = new Student("2", "Кинчев");
        students.add(st8);
        Student st9 = new Student("3", "Кипелов");
        students.add(st9);
        Student st0 = new Student("1", "Ревякин");
        students.add(st0);

        LinkedList<Student> studentsCopy = new  LinkedList<>();
        Student stС1 = new Student("3", "Гребенщиков");
        studentsCopy.add(stС1);
        Student stС2 = new Student("2", "Васильев");
        studentsCopy.add(stС2);
        Student stС3 = new Student("5", "Миккельсен");
        studentsCopy.add(stС3);

        printStudents(students, "1");
        intersect(students, studentsCopy );
        union(students, studentsCopy );
    }
}
