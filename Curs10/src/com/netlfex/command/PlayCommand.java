package com.netlfex.command;

public class PlayCommand implements Command {
    private final AbstractPlayer player;

    public PlayCommand(AbstractPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}
