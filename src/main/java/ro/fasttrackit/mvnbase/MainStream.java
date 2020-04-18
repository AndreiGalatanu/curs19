package ro.fasttrackit.mvnbase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class MainStream {
    public static void main(String[] args) {
        streamOnNames();
    }

    private static void streamOnNames() {
        List<String> names = List.of("Darius", "Dragos", "Maria", "Andrei", "Calina","Ana", "Ionut");

        List<String> upperNames = names.stream()
                .filter(name -> name.length() > 3)
                .map(name -> name.toUpperCase())
                .collect(toList());
        System.out.println(upperNames);


        System.out.println(names.stream()
                .filter(name -> name.length() > 3)
                .filter(name -> name.startsWith("D"))
                .map(String::toUpperCase)
                .map(e -> "- " + e)
                .collect(toList()));

        Set<String> result = names.stream()
                .filter(name -> toFemale(name))
                .map(name -> "* " + name + " *")
                .collect(Collectors.toSet());
        System.out.println(result);
    }

    private static boolean toFemale(String name) {
        return name.endsWith("a") || name.endsWith("n") || name.endsWith("e");
    }


}



