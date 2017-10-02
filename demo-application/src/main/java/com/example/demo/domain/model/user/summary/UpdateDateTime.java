package com.example.demo.domain.model.user.summary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UpdateDateTime {
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime value;

    public UpdateDateTime(LocalDateTime value) {
        this.value = value;
    }

    public String asText() {
        return value.format(formatter);
    }
}
