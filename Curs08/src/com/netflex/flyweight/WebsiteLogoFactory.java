package com.netflex.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteLogoFactory {
    private Map<String, WebsiteLogo> logos = new HashMap<>();

    public WebsiteLogoFactory() {
        WebsiteLogo netflexLogo = new WebsiteLogo("netflex", "base64");
        WebsiteLogo playLogo = new WebsiteLogo("play", "otherBase64value");
        logos.put(netflexLogo.getName(), netflexLogo);
        logos.put(playLogo.getName(), playLogo);
    }

    public WebsiteLogo getLogo(String key) {
        return logos.get(key);
    }
}
