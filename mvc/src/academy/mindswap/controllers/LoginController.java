package academy.mindswap.controllers;

import academy.mindswap.models.User;
import academy.mindswap.views.View;

import java.util.LinkedList;
import java.util.Optional;

public class LoginController implements Controller {

    private View view;
    private LinkedList<User> users;
    private Controller nextController;

    public LoginController() {
        users = new LinkedList<>();
    }

    @Override
    public void init() {
        createUsers();
        view.show();
        nextController.init();
    }

    private void createUsers() {
        users.add(new User("crazycatlady_21", 1, "cats_are_cool@gmail.com", "catsarelife"));
        users.add(new User("been_there_done_that", 2, "johnnyc82@gmail.com", "password"));
        users.add(new User("smverissimo90", 3, "smverissimo90@gmail.com", "1234"));
        users.add(new User("shaquille-oatmeal", 4, "shaqthebest@gmail.com", "psswd"));
        users.add(new User("chicksbeforeducks", 5, "camisanchez34@gmail.com", "quack"));
    }

    public boolean doAuthentication(String username, String password) {
        Optional<User> authenticatedUser = users.stream()
                .filter(user -> user.getUsername().equals(username))
                .filter(user -> user.getPassword().equals(password))
                .findFirst();

        return authenticatedUser.isPresent();
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }
}
