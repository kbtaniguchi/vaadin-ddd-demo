package com.example.demo.presentation.view.useradmin.dialog.delete.view;

import com.example.demo.presentation.view.fundamentals.fragment.dialog.confirm.ConfirmDialog;
import com.example.demo.presentation.view.useradmin.dialog.delete.presenter.IDeleteConfirmDialog;
import com.example.demo.presentation.view.useradmin.dialog.delete.presenter.IDeleteConfirmPresenter;
import com.example.demo.presentation.view.useradmin.root.presenter.IUserAdminView;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = DeleteConfirmDialog.VIEW_NAME)
public class DeleteConfirmDialog extends ConfirmDialog implements View, IDeleteConfirmDialog {
    public final static String VIEW_NAME = "DeleteConfirmDialog";

    IDeleteConfirmPresenter presenter;

    @Autowired
    public DeleteConfirmDialog(IDeleteConfirmPresenter presenter) {
        super("Are you sure you want to permanently delete?");
        this.presenter = presenter;
    }

    @PostConstruct
    void init() {
        presenter.attachView(this);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        IUserAdminView sourceView = (IUserAdminView) event.getOldView();
        addClickListenerToOkButton(e -> presenter.clickOkButton(sourceView.allGridSelections()));
        addClickListenerToCancelButton(e -> presenter.clickCancelButton());
    }

    @Override
    public void returnUserAdminView() {
        close();
        UI.getCurrent().getNavigator().navigateTo(UserAdminView.VIEW_NAME);
    }
}
