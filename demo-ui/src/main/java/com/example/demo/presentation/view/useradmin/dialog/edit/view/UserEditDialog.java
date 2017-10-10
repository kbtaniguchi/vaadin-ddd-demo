package com.example.demo.presentation.view.useradmin.dialog.edit.view;

import com.example.demo.presentation.view.fundamentals.fragment.dialog.form.FormDialog;
import com.example.demo.presentation.view.useradmin.dialog.edit.presenter.IUserEditDialog;
import com.example.demo.presentation.view.useradmin.dialog.edit.presenter.IUserEditPresenter;
import com.example.demo.presentation.view.useradmin.root.presenter.IUserAdminView;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = UserEditDialog.VIEW_NAME)
public class UserEditDialog extends FormDialog implements View, IUserEditDialog {
    public final static String VIEW_NAME = "UserEditDialog";

    UserEditForm form;

    IUserEditPresenter presenter;

    @Autowired
    public UserEditDialog(IUserEditPresenter presenter) {
        super("User Edit Dialog");
        this.presenter = presenter;
    }

    @PostConstruct
    void init() {
        presenter.attachView(this);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // initialize from data of transition source view
        IUserAdminView sourceView = (IUserAdminView) event.getOldView();
        this.form = new UserEditForm(sourceView.gridSelection());
        setForm(form);

        addClickEvenListenerToSaveButton(e -> presenter.onClickSaveButton(form.valueAsUserEditor()));
        addClickEventListenerToCancelButton(e -> presenter.onClickCancelButton());
    }

    @Override
    public boolean hasChangesInForm() {
        return form.hasChanges();
    }

    @Override
    public void showNoChangeErrorMessage() {
        Notification.show("There is no change.", Notification.Type.ERROR_MESSAGE);
    }

    @Override
    public boolean hasValidationErrors() {
        return form.hasValidationErrors();
    }

    @Override
    public void showValidationErrorMessages() {
        form.validate();
        setErrorMessageAsHtml(form.errorMessagesAsHtml());
        setVisibleOfErrorDisplay(true);
    }

    @Override
    public void hideErrorMessages() {
        setVisibleOfErrorDisplay(false);
    }

    @Override
    public void returnUserAdminView() {
        // note: getUI() return null
        close();
        UI.getCurrent().getNavigator().navigateTo(UserAdminView.VIEW_NAME);
    }
}
