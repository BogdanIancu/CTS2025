package com.netflex.proxy;

import java.util.List;

public class SearchService implements AbstractSearchService {
    @Override
    public List<String> search(String input) {
        try {
            System.out.println("Searching...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if ("an".equals(input)) {
            return List.of("Titanic", "Antman");
        } else if ("friends".equals(input)) {
            return List.of("Friends", "Smiling Friends");
        } else {
            return List.of();
        }
    }
}
