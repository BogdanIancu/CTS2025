package com.netflex.main;

import com.netflex.memento.NetflexApp;
import com.netflex.memento.NetflexAppPage;
import com.netflex.template.NetflexLogin;
import com.netflex.template.TvAppLogin;

public class Main {
    public static void main(String[] args) {
        NetflexApp app = new NetflexApp(new NetflexAppPage("Home"));
        app.navigateTo(new NetflexAppPage("This week's titles"));
        app.navigateTo(new NetflexAppPage("Drama"));
        app.navigateTo(new NetflexAppPage("Comedies"));

        app.navigateBack();
        System.out.println(app.getCurrentPage().getTitle());

        app.navigateBack();
        System.out.println(app.getCurrentPage().getTitle());

        NetflexLogin login = new TvAppLogin();
        login.loadAccountDetails();
    }
}
