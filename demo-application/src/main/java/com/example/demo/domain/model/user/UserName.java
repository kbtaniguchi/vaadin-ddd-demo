package com.example.demo.domain.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class UserName {
    @NotEmpty(message = "'User Name' is mandatory.")
    @Size(min = 1, max = 50, message = "Max size of 'User Name' is {max}.")
    String value;

    public UserName(String value) {
        this.value = value;
    }

    public String asText() {
        return value;
    }

    public boolean same(UserName other) {
        return other.value.equals(this.value);
    }

    public static String caption() {
        return "User Name";
    }

    public static String propertyName() {
        return "value";
    }
}
