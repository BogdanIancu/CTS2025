package com.netlfex.command;

public class StopCommand implements Command {
    private final AbstractPlayer player;

    public StopCommand(AbstractPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }
}
