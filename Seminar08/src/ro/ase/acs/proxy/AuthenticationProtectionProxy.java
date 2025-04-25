package ro.ase.acs.proxy;

public class AuthenticationProtectionProxy implements AbstractAuthenticationService {
    private AbstractAuthenticationService authenticationService;
    private int noOfFailedAttempts = 0;

    public AuthenticationProtectionProxy(AbstractAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Override
    public boolean login(String username, String password) {
        if (noOfFailedAttempts > 4) {
            return false;
        }
        boolean isAuthenticationSuccessful =
                authenticationService.login(username, password);
        if (isAuthenticationSuccessful) {
            noOfFailedAttempts = 0;
            return true;
        } else {
            noOfFailedAttempts++;
            return false;
        }

    }
}
