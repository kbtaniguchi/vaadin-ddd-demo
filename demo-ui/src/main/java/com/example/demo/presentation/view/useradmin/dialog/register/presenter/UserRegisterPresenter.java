package com.example.demo.presentation.view.useradmin.dialog.register.presenter;

import com.example.demo.application.service.user.UserService;
import com.example.demo.domain.model.user.User;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import org.springframework.beans.factory.annotation.Autowired;

@SpringComponent
@ViewScope
public class UserRegisterPresenter implements IUserRegisterPresenter {
    IUserRegisterDialog view;

    UserService userService;

    @Autowired
    public UserRegisterPresenter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void attachView(IUserRegisterDialog view) {
        this.view = view;
    }

    @Override
    public void clickSaveButton(User user) {
        if (view.hasValidationErrors()) {
            view.showValidationErrorMessages();
            return;
        }
        userService.register(user);
        view.returnUserAdminView();
    }

    @Override
    public void clickCancelButton() {
        view.returnUserAdminView();
    }
}
