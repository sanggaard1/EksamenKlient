package SDK.controller;


import SDK.views.MainView;
import SDK.views.UserMainView;

/**
 * Created by Sanggaard on 17/11/2016.
 */

public class Controller {
    private MainView mainView;
    private UserMainView userMainView;

    public Controller(MainView mainView, UserMainView userMainView) {
        this.mainView = mainView;
        this.userMainView = userMainView;

    }

    public Controller() {

    }

    public MainView showMainView() {

        return mainView;
    }

    public MainView getMainView() {

        return mainView;
    }

    public UserMainView getUserMainView() {

        return userMainView;
    }
}