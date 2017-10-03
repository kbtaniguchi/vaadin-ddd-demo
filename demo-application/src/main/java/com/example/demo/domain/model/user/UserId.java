package com.example.demo.domain.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

// need getter/setter and no args constructor for ui binding
// TODO can direct field access?
@Data
@NoArgsConstructor
public class UserId {
    @NotEmpty(message = "'User Id' is a mandatory field.")
    @Size(min = 1, max = 30, message = "Please enter 'User id' in {max} characters or less.")
    String value;

    public UserId(String value) {
        this.value = value;
    }

    public String asText() {
        return value;
    }
}
