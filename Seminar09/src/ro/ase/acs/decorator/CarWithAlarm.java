package ro.ase.acs.decorator;

public class CarWithAlarm extends CarDecorator {

    public CarWithAlarm(Vehicle vehicle) {
        super(vehicle);
    }

    public void activateAlarm() {
        System.out.println("Alarm is on");
    }

    @Override
    public void stop() {
        super.stop();
        activateAlarm();
    }
}
