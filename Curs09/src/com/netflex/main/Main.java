package com.netflex.main;

import com.netflex.chain.ParentalControlHandler;
import com.netflex.chain.RegionAvailabilityHandler;
import com.netflex.chain.SubscriptionHandler;
import com.netflex.decorator.LiveVideo;
import com.netflex.decorator.Playable;
import com.netflex.decorator.TemporaryVideo;
import com.netflex.decorator.Video;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Playable playable = new Video("Wednesday");
        playable.play();
        playable.stop();

        TemporaryVideo temporaryVideo = new TemporaryVideo(playable);
        temporaryVideo.setAvailableUntil(LocalDate.now().plusDays(5));
        System.out.println(temporaryVideo.getAvailableUntil());

        LiveVideo liveVideo = new LiveVideo(temporaryVideo);
        var countries = liveVideo.getCountriesWhereAvailable();
        System.out.println(countries);

        ParentalControlHandler parentalControlHandler =
                new ParentalControlHandler();
        RegionAvailabilityHandler regionAvailabilityHandler =
                new RegionAvailabilityHandler();
        SubscriptionHandler subscriptionHandler =
                new SubscriptionHandler();

        com.netflex.chain.Video video = new com.netflex.chain.Video();
        video.isAgeRestricted = true;

        parentalControlHandler.setParentalControlOn(true);
        parentalControlHandler.setNextHandler(regionAvailabilityHandler);
        regionAvailabilityHandler.setNextHandler(subscriptionHandler);
        boolean result = parentalControlHandler.canBePlayed(video);
        System.out.println(result);

        video.isAgeRestricted = false;
        regionAvailabilityHandler.setRegion("Romania");
        result = parentalControlHandler.canBePlayed(video);
        System.out.println(result);
    }
}
