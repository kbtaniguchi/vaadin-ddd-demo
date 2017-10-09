package com.example.demo.presentation.view.useradmin.root.view.grid;

import com.example.demo.domain.model.user.summary.UserSummaries;
import com.example.demo.domain.model.user.summary.UserSummary;
import com.vaadin.ui.Grid;

public class UserSummaryGrid extends Grid<UserSummary> {

    public UserSummaryGrid() {
        setSizeFull();
        setSelectionMode(SelectionMode.MULTI);

        addColumn(UserSummary::statusAsText).setCaption("status");
        addColumn(userSummary -> userSummary.profile().userId().asText()).setCaption("id");
        addColumn(userSummary -> userSummary.profile().userName().asText()).setCaption("name");
        addColumn(userSummary -> userSummary.profile().emailAddress().asText()).setCaption("email");
        addColumn(userSummary -> userSummary.audit().createdAt().asTextDateTime()).setCaption("created");
        addColumn(userSummary -> userSummary.audit().updatedAt().asTextDateTime()).setCaption("updated");
    }

    public void reflectFrom(UserSummaries userSummaries) {
        setItems(userSummaries.asList());
    }

    public UserSummary selection() {
        return getSelectedItems().stream()
                .findFirst().orElseThrow(IllegalStateException::new);
    }

    public UserSummaries allSelections() {
        return new UserSummaries(getSelectedItems());
    }

}
