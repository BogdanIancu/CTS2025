package ro.ase.acs.main;

import ro.ase.acs.simplefactory.RestApi;
import ro.ase.acs.simplefactory.RestApiFactory;
import ro.ase.acs.simplefactory.RestApiFactoryV2;
import ro.ase.acs.simplefactory.ServerType;
import ro.ase.acs.singleton.Logger;
import ro.ase.acs.singleton.LoggerV2;
import ro.ase.acs.singleton.LoggerV3;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Message from main");
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Another message from main");
        System.out.println(logger == anotherLogger);

        LoggerV2 loggerV2 = LoggerV2.instance;
        loggerV2.log("LoggerV2");
        LoggerV2.instance.log("Another LoggerV2");

        LoggerV3 loggerV3 = LoggerV3.INSTANCE;
        loggerV3.log("LoggerV3");
        LoggerV3.INSTANCE.log("Another LoggerV3");

        RestApiFactory restApiFactory = new RestApiFactory();
        RestApi api = restApiFactory.getRestApi("development");
        api.connect();

        RestApiFactoryV2 restApiFactoryV2 = new RestApiFactoryV2();
        RestApi api2 = restApiFactoryV2.getRestApi(ServerType.PROD);
        api2.connect();
    }
}
