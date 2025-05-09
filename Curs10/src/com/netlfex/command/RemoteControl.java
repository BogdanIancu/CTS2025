package com.netlfex.command;

public class RemoteControl {
    private Command firstCommand;
    private Command secondCommand;
    private Command thirdCommand;

    public void setFirstCommand(Command firstCommand) {
        this.firstCommand = firstCommand;
    }

    public void setThirdCommand(Command thirdCommand) {
        this.thirdCommand = thirdCommand;
    }

    public void setSecondCommand(Command secondCommand) {
        this.secondCommand = secondCommand;
    }

    public void pressButton(int buttonNumber) {
        switch (buttonNumber) {
            case 1:
                if ((firstCommand != null)) {
                    firstCommand.execute();
                }
                break;
            case 2:
                if ((secondCommand != null)) {
                    secondCommand.execute();
                }
                break;
            case 3:
                if ((thirdCommand != null)) {
                    thirdCommand.execute();
                }
                break;
        }
    }
}
