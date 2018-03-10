package com.kodilla.goodPatterns.challenges;
import com.kodilla.goodPatterns.challenges.MovieStory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoryRun {
    public static void main(String[] args){
        MovieStory movieStory = new MovieStory();

        String movieStoryList = movieStory.getMovies().entrySet().stream()
                .map(k -> k.getValue())
                .flatMap(s ->s.stream())
                .collect(Collectors.joining("!","<<", ">>"));

        System.out.println(movieStoryList);



    }
}

