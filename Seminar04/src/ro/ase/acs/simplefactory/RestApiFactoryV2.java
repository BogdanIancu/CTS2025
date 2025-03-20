package ro.ase.acs.simplefactory;

public class RestApiFactoryV2 {
    public RestApi getRestApi(ServerType serverType){
        switch (serverType){
            case DEV -> { return new RestApiDevelopment(); }
            case PROD -> { return new RestApiProduction(); }
            default -> throw new IllegalArgumentException();
        }
    }
}
