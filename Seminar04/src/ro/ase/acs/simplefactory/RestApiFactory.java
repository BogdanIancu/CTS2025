package ro.ase.acs.simplefactory;

public class RestApiFactory {
    public static final String DEVELOPMENT = "development";
    public static final String PRODUCTION = "production";

    public RestApi getRestApi(String serverType) {
        if (DEVELOPMENT.equals(serverType)) {
            return new RestApiDevelopment();
        } else if (PRODUCTION.equals(serverType)) {
            return new RestApiProduction();
        }
        return null;
    }
}
