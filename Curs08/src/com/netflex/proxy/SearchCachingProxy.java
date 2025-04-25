package com.netflex.proxy;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchCachingProxy implements AbstractSearchService {
    private static final int CACHE_DURATION_IN_SECONDS = 5;
    private final AbstractSearchService searchService;
    private Map<String, List<String>> cache = new HashMap<>();
    private LocalDateTime cacheTimestamp = LocalDateTime.MIN;

    public SearchCachingProxy(AbstractSearchService searchService) {
        this.searchService = searchService;
    }

    @Override
    public List<String> search(String input) {
        LocalDateTime currentTimestamp = LocalDateTime.now();
        long durationInSeconds =
                ChronoUnit.SECONDS.between(cacheTimestamp, currentTimestamp);
        if (durationInSeconds < CACHE_DURATION_IN_SECONDS) {
            return cache.get(input);
        }

        List<String> result = searchService.search(input);
        cache.put(input, result);
        cacheTimestamp = LocalDateTime.now();
        return result;
    }
}
