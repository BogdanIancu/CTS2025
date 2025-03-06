package com.netflex.kiss;

import java.util.List;

interface RecommendationStrategy {
    List<Movie> getRecommendations(List<Movie> movies);
}
