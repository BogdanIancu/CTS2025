package ro.ase.acs.singleton;

import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
