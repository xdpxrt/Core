package src.Students;

import java.util.ArrayList;

public class Utilities {
    static void splitTo3(ArrayList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    static int getNumberOfSimilarStudents(ArrayList<Person> list, Person student) {
        int numberOfSimilar = 0;
        for (Person p : list) {
            if (student.equals(p)) {
                numberOfSimilar++;
            }
        }
        return ++numberOfSimilar;
    }
}