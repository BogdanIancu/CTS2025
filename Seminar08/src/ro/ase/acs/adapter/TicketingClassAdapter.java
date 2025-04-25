package ro.ase.acs.adapter;

public class TicketingClassAdapter extends BusTicketingSystem implements AbstractTrainTicketingSystem {
    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        this.reserveSeat();
    }
}
