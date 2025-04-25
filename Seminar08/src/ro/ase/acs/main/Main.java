package ro.ase.acs.main;

import ro.ase.acs.adapter.*;
import ro.ase.acs.facade.CarFacade;
import ro.ase.acs.proxy.AbstractAuthenticationService;
import ro.ase.acs.proxy.AuthenticationProtectionProxy;
import ro.ase.acs.proxy.AuthenticationService;

public class Main {
    public static void main(String[] args) {
        AbstractTrainTicketingSystem ticketingSystem = new TrainTicketingSystem();
        ticketingSystem.buyTicket(2, 30);

        ticketingSystem = new TicketingObjectAdapter(new BusTicketingSystem());
        ticketingSystem.buyTicket(2, 30);

        ticketingSystem = new TicketingClassAdapter();
        ticketingSystem.buyTicket(2, 30);

        CarFacade car = new CarFacade();
        car.start();
        car.emergencyBrake();

        System.out.println();
        AbstractAuthenticationService authenticationService =
                new AuthenticationService();
        boolean result = authenticationService.login("admin", "admin");
        System.out.println(result);

        authenticationService = new AuthenticationProtectionProxy(
                new AuthenticationService());
        for (int i = 0; i < 5; i++) {
            authenticationService.login("wrong", "password");
        }

        result = authenticationService.login("admin", "admin");
        System.out.println(result);
    }
}
