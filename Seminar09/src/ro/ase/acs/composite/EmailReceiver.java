package ro.ase.acs.composite;

import java.util.List;

public interface EmailReceiver {
    void receive(String message);

    void addReceiver(EmailReceiver receiver);

    void deleteReceiver(EmailReceiver receiver);

    List<EmailReceiver> getReceivers();

}
