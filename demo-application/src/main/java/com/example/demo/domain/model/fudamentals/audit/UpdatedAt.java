package com.example.demo.domain.model.fudamentals.audit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UpdatedAt {
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime value;

    public UpdatedAt(String asText) {
        this.value = LocalDateTime.parse(asText, formatter);
    }

    public UpdatedAt(LocalDateTime value) {
        this.value = value;
    }

    public String asTextDateTime() {
        return value.format(formatter);
    }
}
