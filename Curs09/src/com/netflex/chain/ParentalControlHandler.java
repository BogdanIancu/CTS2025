package com.netflex.chain;

public class ParentalControlHandler extends VideoHandler {
    private boolean isParentalControlOn;

    public boolean isParentalControlOn() {
        return isParentalControlOn;
    }

    public void setParentalControlOn(boolean parentalControlOn) {
        isParentalControlOn = parentalControlOn;
    }

    @Override
    public boolean canBePlayed(Video video) {
        if (isParentalControlOn && video.isAgeRestricted) {
            return false;
        } else {
            if (nextHandler != null) {
                return nextHandler.canBePlayed(video);
            }
            return true;
        }
    }
}
