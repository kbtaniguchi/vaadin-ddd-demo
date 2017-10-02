package com.example.demo.presentation.view.useradmin.view.grid;

import com.example.demo.domain.model.user.EmailAddress;
import com.example.demo.domain.model.user.UserName;
import com.example.demo.domain.model.user.summary.UserSummary;
import com.vaadin.ui.Grid;

import java.util.Arrays;
import java.util.List;

public class UserSummaryListGrid extends Grid<UserSummary> {

    public UserSummaryListGrid() {
        setSizeFull();
        setSelectionMode(SelectionMode.MULTI);
        addColumn(userSummary -> userSummary.userName().asText()).setCaption("name");
        addColumn(userSummary -> userSummary.emailAddress().asText()).setCaption("email");

        // TODO dummy data
        List<UserSummary> userSummaries = Arrays.asList(
                new UserSummary(new UserName("test_user_name1"), new EmailAddress("test1@sample.com")),
                new UserSummary(new UserName("test_user_name2"), new EmailAddress("test2@sample.com")),
                new UserSummary(new UserName("test_user_name3"), new EmailAddress("test3@sample.com")));
        setItems(userSummaries);
    }
}
