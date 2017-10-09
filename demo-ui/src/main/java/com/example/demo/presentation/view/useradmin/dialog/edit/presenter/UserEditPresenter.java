package com.example.demo.presentation.view.useradmin.dialog.edit.presenter;

import com.example.demo.application.service.user.UserService;
import com.example.demo.domain.model.user.User;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import org.springframework.beans.factory.annotation.Autowired;

@SpringComponent
@ViewScope
public class UserEditPresenter implements IUserEditPresenter {
    IUserEditDialog view;

    UserService userService;

    @Autowired
    public UserEditPresenter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void attachView(IUserEditDialog view) {
        this.view = view;
    }

    @Override
    public void onClickSaveButton(User user) {
        if (!view.hasChangesInForm()) {
            view.showNoChangeErrorMessage();
            return;
        }
        if (view.hasValidationErrors()) {
            view.showValidationErrorMessages();
            return;
        }
        view.hideErrorMessages();

        userService.revise(user);
        view.returnUserAdminView();
    }

    @Override
    public void onClickCancelButton() {
        view.returnUserAdminView();
    }
}
