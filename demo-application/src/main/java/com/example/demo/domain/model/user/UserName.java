package com.example.demo.domain.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class UserName {
    @NotEmpty(message = "'User Name' is a mandatory field.")
    @Size(min = 1, max = 50, message = "Please enter 'User Name' in {max} characters or less.")
    String value;

    public UserName(String value) {
        this.value = value;
    }

    public String asText() {
        return value;
    }
}
