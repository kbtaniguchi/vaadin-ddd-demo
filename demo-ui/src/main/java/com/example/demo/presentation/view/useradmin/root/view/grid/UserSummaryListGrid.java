package com.example.demo.presentation.view.useradmin.root.view.grid;

import com.example.demo.domain.model.user.EmailAddress;
import com.example.demo.domain.model.user.UserId;
import com.example.demo.domain.model.user.UserName;
import com.example.demo.domain.model.user.summary.CreateDateTime;
import com.example.demo.domain.model.user.summary.UpdateDateTime;
import com.example.demo.domain.model.user.summary.UserSummary;
import com.vaadin.ui.Grid;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class UserSummaryListGrid extends Grid<UserSummary> {

    public UserSummaryListGrid() {
        setSizeFull();
        setSelectionMode(SelectionMode.MULTI);

        addColumn(userSummary -> userSummary.userId().asText()).setCaption("id");
        addColumn(userSummary -> userSummary.userName().asText()).setCaption("name");
        addColumn(userSummary -> userSummary.emailAddress().asText()).setCaption("email");
        addColumn(userSummary -> userSummary.createDateTime().asText()).setCaption("created");
        addColumn(userSummary -> userSummary.updateDateTime().asText()).setCaption("updated");

        // TODO dummy data
        List<UserSummary> userSummaries = Arrays.asList(
                newUserSummary(1),
                newUserSummary(2),
                newUserSummary(3));
        setItems(userSummaries);
    }

    private UserSummary newUserSummary(int number) {
        String numberStr = String.valueOf(number);
        return new UserSummary(
                new UserId("dummy_user_id_" + numberStr),
                new UserName("dummy_user_name_" + numberStr),
                new EmailAddress("dummy_" + numberStr + "@dummy.com"),
                new CreateDateTime(LocalDateTime.now()),
                new UpdateDateTime(LocalDateTime.now())
        );
    }
}
