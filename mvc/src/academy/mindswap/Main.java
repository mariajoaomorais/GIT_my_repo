package academy.mindswap;

import academy.mindswap.controllers.LoginController;
import academy.mindswap.controllers.MainController;
import academy.mindswap.views.LaternaMainView;
import academy.mindswap.views.LoginView;
import academy.mindswap.views.View;

public class Main {

    public static void main(String[] args) {
        LoginController loginController = new LoginController();
        LoginView loginView = new LoginView();
        View mainView = new LaternaMainView();
        MainController mainController = new MainController();

        loginController.setView(loginView);
        loginView.setController(loginController);
        loginController.setNextController(mainController);

        mainController.setView(mainView);

        loginController.init();
    }
}
