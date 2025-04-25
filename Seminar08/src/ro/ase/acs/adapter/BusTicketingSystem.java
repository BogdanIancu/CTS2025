package ro.ase.acs.adapter;

public class BusTicketingSystem implements AbstractBusTicketingSystem {
    private static final int NO_OF_SEATS = 50;
    private int noOfOccupiedSeats = 0;

    @Override
    public void reserveSeat() {
        if (noOfOccupiedSeats < NO_OF_SEATS) {
            System.out.println("Seat reserved!");
            noOfOccupiedSeats++;
        } else {
            System.out.println("Bus is full!");
        }

    }
}
