package com.example.demo.domain.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@NoArgsConstructor
public class EmailAddress {
    @NotEmpty(message = "'Email Address' is a mandatory field.")
    @Email(message = "Please enter valid email address.")
    String value;

    public EmailAddress(String value) {
        this.value = value;
    }

    public String asText() {
        return value;
    }
}
