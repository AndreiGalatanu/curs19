package ro.fasttrackit.mvnbase.Homework19;

import java.util.Objects;

public class Person {
    private final String firstName;
    private final String LastName;
    private final int age;
    private final String city;

    public Person(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.city = city;
    }


    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(LastName, person.LastName) &&
                Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, LastName, age, city);
    }
}
