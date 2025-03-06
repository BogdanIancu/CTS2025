package com.netflex.kiss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DirectApproach {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Inception", 8.8),
                new Movie("Interstellar", 8.6),
                new Movie("The Irishman", 7.9),
                new Movie("Bird Box", 6.6)
        );

        List<Movie> recommended = movies.stream()
                .sorted((a, b) -> Double.compare(b.rating, a.rating))
                .limit(3)
                .collect(Collectors.toList());

        recommended.forEach(m -> System.out.println(m.title));
    }
}
