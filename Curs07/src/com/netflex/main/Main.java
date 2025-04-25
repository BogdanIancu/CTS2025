package com.netflex.main;

import com.netflex.adapter.*;
import com.netflex.facade.HomeScreenFacade;

public class Main {
    public static void main(String[] args) {
        AbstractAdService adService = new AdService();
        adService.displayAd(10);

        AbstractVideoAdService videoAdService = new VideoAdService();
        adService = new AdServiceObjectAdapter(videoAdService);
        adService.displayAd(10);

        adService = new AdServiceClassAdapter();
        adService.displayAd(10);

        System.out.println();
        HomeScreenFacade facade = new HomeScreenFacade();
        facade.search("something");
        facade.play(1);
    }
}
