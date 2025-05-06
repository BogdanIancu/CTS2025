package ro.ase.acs.composite;

import java.util.List;

public class EmailAddress implements EmailReceiver {
    private String address;

    public EmailAddress(String address) {
        this.address = address;
    }

    @Override
    public void receive(String message) {
        System.out.println(address + ": " + message);
    }

    @Override
    public void addReceiver(EmailReceiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteReceiver(EmailReceiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<EmailReceiver> getReceivers() {
        throw new UnsupportedOperationException();
    }
}
