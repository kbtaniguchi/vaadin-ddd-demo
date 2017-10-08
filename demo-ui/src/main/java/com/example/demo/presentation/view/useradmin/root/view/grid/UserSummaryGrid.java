package com.example.demo.presentation.view.useradmin.root.view.grid;

import com.example.demo.domain.model.fudamentals.audit.Audit;
import com.example.demo.domain.model.fudamentals.audit.CreatedAt;
import com.example.demo.domain.model.fudamentals.audit.UpdatedAt;
import com.example.demo.domain.model.user.EmailAddress;
import com.example.demo.domain.model.user.UserId;
import com.example.demo.domain.model.user.UserName;
import com.example.demo.domain.model.user.summary.UserProfile;
import com.example.demo.domain.model.user.summary.UserSummary;
import com.vaadin.ui.Grid;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class UserSummaryGrid extends Grid<UserSummary> {

    public UserSummaryGrid() {
        setSizeFull();
        setSelectionMode(SelectionMode.MULTI);

        addColumn(userSummary -> userSummary.profile().userId().asText()).setCaption("id");
        addColumn(userSummary -> userSummary.profile().userName().asText()).setCaption("name");
        addColumn(userSummary -> userSummary.profile().emailAddress().asText()).setCaption("email");
        addColumn(userSummary -> userSummary.audit().createdAt().asTextDateTime()).setCaption("created");
        addColumn(userSummary -> userSummary.audit().updatedAt().asTextDateTime()).setCaption("updated");

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
                new UserProfile(
                        new UserId("dummy_user_id_" + numberStr),
                        new UserName("dummy_user_name_" + numberStr),
                        new EmailAddress("dummy_" + numberStr + "@dummy.com")),
                new Audit(
                        new CreatedAt(LocalDateTime.now()),
                        new UpdatedAt(LocalDateTime.now())));
    }

}
