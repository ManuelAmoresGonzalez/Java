package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> streamStrings = Stream.of("Antonio","María","Juan","Pedro")
                .filter(s -> s.contains("a"));

        Stream<String> streamStrings1 = Stream.of("Antonio","María","Juan","Pedro")
                .map(s -> s.toUpperCase());

        Long streamStrings2 = Stream.of("Antonio","María","Juan","Pedro")
                .count();

        Boolean streamStrings3 = Stream.of("Antonio","María","Juan","Pedro")
                .anyMatch(s -> s.contains("M"));

        List<String> convertValues = streamStrings.collect(Collectors.toList());
        System.out.println(convertValues);
        /*List<String> lista = Arrays.asList("Antonio","María","Juan","Pedro");
        Stream<String> streamDeLista = lista.stream();
        System.out.println(streamStrings);*/
    }
}