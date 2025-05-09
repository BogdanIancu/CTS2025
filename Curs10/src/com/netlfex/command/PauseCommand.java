package com.netlfex.command;

public class PauseCommand implements Command {
    private final AbstractPlayer player;

    public PauseCommand(AbstractPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.pause();
    }
}
