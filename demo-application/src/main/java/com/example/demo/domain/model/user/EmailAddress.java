package com.example.demo.domain.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@NoArgsConstructor
public class EmailAddress {
    @NotEmpty(message = "'Email Address' is mandatory.")
    @Email(message = "'Email Address' value is invalid.")
    String value;

    public EmailAddress(String value) {
        this.value = value;
    }

    public String asText() {
        return value;
    }

    public static String caption() {
        return "Email Address";
    }

    public static String propertyName() {
        return "value";
    }
}
