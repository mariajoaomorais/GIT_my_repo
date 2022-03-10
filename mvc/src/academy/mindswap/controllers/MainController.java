package academy.mindswap.controllers;

import academy.mindswap.views.View;

public class MainController implements Controller {

    private View mainView;

    @Override
    public void init() {
        mainView.show();
    }

    public void setView(View mainView) {
        this.mainView = mainView;
    }
}
