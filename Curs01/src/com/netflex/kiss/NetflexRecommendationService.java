package com.netflex.kiss;

import java.util.List;

class NetflexRecommendationService {
    private RecommendationStrategy strategy;

    public NetflexRecommendationService(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Movie> recommendMovies(List<Movie> userMovies) {
        if (userMovies == null || userMovies.isEmpty()) {
            throw new IllegalArgumentException("Movie list cannot be empty");
        }
        return strategy.getRecommendations(userMovies);
    }
}
