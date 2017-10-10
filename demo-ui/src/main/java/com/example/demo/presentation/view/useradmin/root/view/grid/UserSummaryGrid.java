package com.example.demo.presentation.view.useradmin.root.view.grid;

import com.example.demo.domain.model.user.summary.UserSummaries;
import com.example.demo.domain.model.user.summary.UserSummary;
import com.vaadin.data.ValueProvider;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.ui.Grid;

public class UserSummaryGrid extends Grid<UserSummary> {
    static ValueProvider<UserSummary, String> statusValueProvider = UserSummary::statusAsText;
    static ValueProvider<UserSummary, String> userIdValueProvider = userSummary -> userSummary.profile().userId().asText();
    static ValueProvider<UserSummary, String> userNameValueProvider = userSummary -> userSummary.profile().userName().asText();
    static ValueProvider<UserSummary, String> emailAddressValueProvider = userSummary -> userSummary.profile().emailAddress().asText();
    static ValueProvider<UserSummary, String> createdAtValueProvider = userSummary -> userSummary.audit().createdAt().asTextDateTime();
    static ValueProvider<UserSummary, String> updatedAtValueProvider = userSummary -> userSummary.audit().updatedAt().asTextDateTime();
    static ValueProvider<UserSummary, String> versionValueProvider = userSummary -> userSummary.audit().version().asText();

    ListDataProvider<UserSummary> dataProvider;

    public UserSummaryGrid() {
        setSizeFull();
        setSelectionMode(SelectionMode.MULTI);

        addColumn(statusValueProvider).setCaption("status");
        addColumn(userIdValueProvider).setCaption("id");
        addColumn(userNameValueProvider).setCaption("name");
        addColumn(emailAddressValueProvider).setCaption("email");
        addColumn(createdAtValueProvider).setCaption("created");
        addColumn(updatedAtValueProvider).setCaption("updated");
        addColumn(versionValueProvider).setCaption("version");
    }

    public void binding(UserSummaries userSummaries) {
        this.dataProvider = DataProvider.ofCollection(userSummaries.asList());
        setDataProvider(dataProvider);
    }

    public UserSummary selection() {
        return getSelectedItems().stream()
                .findFirst().orElseThrow(IllegalStateException::new);
    }

    public UserSummaries allSelections() {
        return new UserSummaries(getSelectedItems());
    }

    public void filterBy(String searchText) {
        dataProvider.setFilter(userSummary -> userSummary.profile().containsWithIgnoreCase(searchText));
    }
}
