package ro.ase.acs.singleton;

import java.time.LocalDateTime;

public class LoggerV2 {
    public static final LoggerV2 instance = new LoggerV2();

    private LoggerV2(){
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
