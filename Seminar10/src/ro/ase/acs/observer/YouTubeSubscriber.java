package ro.ase.acs.observer;

public class YouTubeSubscriber implements Observer {
    @Override
    public void receiveNotification(String message) {
        System.out.println("Notification: " + message);
    }
}
