package com.example.demo.presentation.view.useradmin.root.presenter;

public interface IUserAdminPresenter {

    void attachView(IUserAdminView view);

    void loadUserSummaries();

    void onClickAddButton();

    void onClickEditButton();

    void onClickDeleteButton();

    void onSelectGrid();

}
