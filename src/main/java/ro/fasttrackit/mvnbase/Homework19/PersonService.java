package ro.fasttrackit.mvnbase.Homework19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.*;

public class PersonService {

    private final List<Person> persons;

    public PersonService() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.persons.add(person);

    }

    public ArrayList<Person> getPersons() {
        return new ArrayList<>(persons);
    }

    private String firstLast(Person person) {
        return person.getFirstName() + "" + person.getLastName();
    }

    public List<String> getFullName() {

        return persons.stream()
                .map(this::firstLast)
                .collect(toList());


    }

    public List<Person> getMajors() {
        return persons.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(toList());

    }


    public List<Person> fromOradea() {
        return persons.stream()
                .filter(person -> person.getCity().equals("Oradea"))
                .collect(toList());
    }

    public List<Person> fromOradeaOrCj() {
        return persons.stream()
                .filter(person -> person.getCity().equals("Oradea") || person.getCity().equals("Cluj"))
                .collect(toList());
    }

    public List<String> firstNCap() {
        return persons.stream()
                .map(person -> person.getFirstName().toUpperCase())
                .collect(toList());
    }

    public List<String> lastLetter() {
        return persons.stream()
                .map(person -> person.getFirstName() + "" + person.getLastName().charAt(0))
                .collect(toList());
    }


    public List<Person> ageLimit() {
        return persons.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() <= 60)
                .collect(toList());
    }

    public List<Person> startsWithA() {
        return persons.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .collect(toList());

    }

    public List<Person> uniqueName() {
        return persons.stream()
                .filter(person -> person.getFirstName() != person.getFirstName())
                .collect(toList());
    }

    public List<Person> sortFirstName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(toList());
    }

    public List<Person> sortByLast() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(toList());
    }

    public List<Person> compareAll() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName)
                        .thenComparing(Person::getLastName)
                        .thenComparing(Person::getAge))
                .collect(toList());
    }

}



