package ro.ase.acs.adapter;

public class TrainTicketingSystem implements AbstractTrainTicketingSystem {
    private static final int NO_OF_WAGONS = 5;
    private static final int NO_OF_SEATS_PER_WAGON = 100;

    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        boolean isWagonValid = wagonNo >= 1 && wagonNo <= NO_OF_WAGONS;
        boolean isSeatValid = seatNo >= 1 && seatNo <= NO_OF_SEATS_PER_WAGON;

        if (isSeatValid && isWagonValid) {
            System.out.println("Ticket issued for wagon " + wagonNo +
                    " and seat " + seatNo);
        }
    }

}
