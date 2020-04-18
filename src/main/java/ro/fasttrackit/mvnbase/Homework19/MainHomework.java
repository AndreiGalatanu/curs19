package ro.fasttrackit.mvnbase.Homework19;

import java.util.ArrayList;
import java.util.List;

public class MainHomework {


    public static void main(String[] args) {
        PersonService service = new PersonService();
        service.addPerson(new Person("Ana", "Vin", 23, "Oradea"));
        service.addPerson(new Person("Ben", "Jeos", 26, "Cluj"));
        service.addPerson(new Person("Trice", "Jdso", 13, "Mars"));
        service.addPerson(new Person("Andrew", "Fseo", 53, "Jupiter"));
        service.addPerson(new Person("Vice", "Lopez", 63, "Oradea"));
        service.addPerson(new Person("Joe", "Miriam", 73, "Earth"));
        service.addPerson(new Person("Mike", "Ponle", 43, "Oradea"));


        System.out.println("Full name -" + service.getFullName() + "\n");
        System.out.println("Majors -" + service.getMajors() + "\n");
        System.out.println("Age Limit" + service.ageLimit() + "\n");
        System.out.println("First n cap" + service.firstNCap() + "\n");
        System.out.println("Oradea" + service.fromOradea() + "\n");
        System.out.println("Cluj" + service.fromOradeaOrCj() + "\n");
        System.out.println("Compare all" + service.compareAll() + "\n");


    }

}
