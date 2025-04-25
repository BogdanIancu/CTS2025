package com.netflex.flyweight;

public class WebsiteLogo implements AbstractWebsiteLogo {
    private String name;
    private String base64;

    public WebsiteLogo(String name, String base64) {
        this.name = name;
        this.base64 = base64;
    }

    public String getName() {
        return name;
    }

    @Override
    public void display(LogoProperties position) {
        System.out.println("Displaying " + name + " logo at " +
                position.x + ", " + position.y + ", width: " +
                position.width + ", height: " + position.height);
    }
}
