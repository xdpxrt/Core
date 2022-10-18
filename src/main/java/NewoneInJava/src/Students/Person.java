package NewoneInJava.src.Students;

import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private String gender;
    private int yearOfBirth;

    public Person() {
    }

    public Person(int id, String name, String gender, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && yearOfBirth == person.yearOfBirth && Objects.equals(name, person.name) && Objects.equals(gender, person.gender);
    }


    @Override
    public String toString() {
        return "id: " + id + "| Name: " + name + "| Gender: " + gender + "| Year of Birth: " + yearOfBirth + "\n";
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOFBirth() {
        return this.yearOfBirth;
    }
}
