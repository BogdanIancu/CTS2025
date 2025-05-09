package com.netlfex.main;

import com.netlfex.command.*;
import com.netlfex.observer.Movie;
import com.netlfex.observer.User;
import com.netlfex.strategy.MobilePlayerCompression;
import com.netlfex.strategy.Player;

public class Main {
    public static void main(String[] args) {
        AbstractPlayer player = new NetflexPlayer();
        RemoteControl remoteControl = new RemoteControl();
        Command playCommand = new PlayCommand(player);
        Command pauseCommand = new PauseCommand(player);
        Command stopCommand = new StopCommand(player);

        remoteControl.setFirstCommand(playCommand);
        remoteControl.setSecondCommand(pauseCommand);
        remoteControl.setThirdCommand(stopCommand);

        remoteControl.pressButton(1);
        remoteControl.pressButton(3);

        player = new YoutubePlayer();
        playCommand = new PlayCommand(player);
        pauseCommand = new PauseCommand(player);
        remoteControl.setFirstCommand(playCommand);
        remoteControl.setSecondCommand(pauseCommand);
        remoteControl.setThirdCommand(null);

        remoteControl.pressButton(1);
        remoteControl.pressButton(3);

        Player netflexPlayer = new Player();
        netflexPlayer.setStrategy(new MobilePlayerCompression());
        netflexPlayer.play();

        netflexPlayer.setStrategy(() -> System.out.println("Using custom compression"));
        netflexPlayer.play();

        com.netlfex.state.Player webPlayer = new com.netlfex.state.Player();
        webPlayer.click();
        webPlayer.click();

        Movie movie = new Movie("Wednesday");
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        movie.subscribe(user1);
        movie.subscribe(user2);
        movie.subscribe(user3);

        movie.sendNotification("New episode");
        movie.unsubscribe(user3);
        movie.sendNotification("Season finale");
    }
}
