package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        final List<Students> studentsList = Arrays.asList(
                new Students(1L, "Eric", "Cartman", 12),
                new Students(2L, "Kenny", "McCormick", 13),
                new Students(3L, "Stan", "Marsh", 11),
                new Students(4L, "Kyle", "Broflovski", 12),
                new Students(5L, "Token", "Black", 13),
                new Students(6L, "Leeann", "Cartman", 36));

        studentsList.stream()
                .map(s -> {return new Students(
                        s.getId(),
                        " может бухать: " + s.getFirstName(),
                        s.getLastName(),
                        s.getAge() + 3);
                }).filter(s -> s.getAge() >= 16)
                .sorted(Comparator.comparing(Students::getLastName).thenComparing(Students::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
