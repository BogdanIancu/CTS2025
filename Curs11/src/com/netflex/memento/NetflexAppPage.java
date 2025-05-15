package com.netflex.memento;

import java.util.HashMap;
import java.util.Map;

public class NetflexAppPage {
    private String title;
    private String url;
    private Map<Integer, String> resources = new HashMap<>();

    public NetflexAppPage(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<Integer, String> getResources() {
        return Map.copyOf(resources);
    }

    public void addResource(Integer id, String path) {
        resources.put(id, path);
    }
}
