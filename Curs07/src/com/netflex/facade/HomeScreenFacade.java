package com.netflex.facade;

import java.util.ArrayList;
import java.util.List;

public class HomeScreenFacade {
    private SearchEngine searchEngine = new SearchEngine();
    private RecommendationEngine recommendationEngine = new RecommendationEngine();
    private BufferingEngine bufferingEngine = new BufferingEngine();

    public HomeScreenFacade() {
        recommendationEngine.recommendForCountry();
        recommendationEngine.recommendForUserCluster();
    }

    public List<String> search(String key) {
        List<String> results = new ArrayList<>();
        searchEngine.setTitle(key);
        results.addAll(searchEngine.search());
        searchEngine.setTitle(null);
        searchEngine.setGenre(key);
        results.addAll(searchEngine.search());
        searchEngine.setGenre(null);

        return results;
    }

    public void play(int id) {
        bufferingEngine.setTitle(Integer.toString(id));
        bufferingEngine.play();
    }
}
