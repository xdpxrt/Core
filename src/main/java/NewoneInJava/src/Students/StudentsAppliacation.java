package NewoneInJava.src.Students;

import java.util.ArrayList;

public class StudentsAppliacation {
    public static void main(String[] args) {
        Person student1 = new Person(1, "John", "Male", 1987);
        Person student2 = new Person(2, "Sarah", "Female", 1989);
        Person student3 = new Person(3, "Benjamin", "Male", 1988);
        Person student4 = new Person(4, "Brad", "Male", 1990);
        Person student5 = new Person(5, "Jessica", "Female", 1992);
        Person student6 = new Person(6, "Natalie", "Female", 1991);
        Person student7 = new Person(7, "Terry", "Male", 1992);
        Person student8 = new Person(2, "Sarah", "Female", 1989);

        ArrayList<Person> students = new ArrayList<>(20);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(2, student6);
        students.add(0, student7);
        System.out.println(students);

//        persons.addAll(students);
//        System.out.println(students.get(0));
//        System.out.println(students.get(students.size() - 1));
//        students.remove(student1);
//        students.remove(1);
//        System.out.println(students.contains(student5));
//        Utilities.splitTo3(students);
        System.out.println(Utilities.getNumberOfSimilarStudents(students, student8));
    }
}
