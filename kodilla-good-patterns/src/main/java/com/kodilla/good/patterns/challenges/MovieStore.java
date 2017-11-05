package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

class MovieStore {

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String filmList = movieStore.getMovies().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .map(s->s.toString() )
                .collect(Collectors.joining(" ! "," You should watch : "," . No more films on this list."));

        System.out.println(filmList);
    }
}

