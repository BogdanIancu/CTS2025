package com.netflex.kiss;

import java.util.Comparator;
import java.util.List;

class TopRatedStrategy implements RecommendationStrategy {

    @Override
    public List<Movie> getRecommendations(List<Movie> movies) {
        movies.sort(Comparator.comparingDouble((Movie m) -> m.rating).reversed());
        return movies.subList(0, Math.min(3, movies.size()));
    }
}
