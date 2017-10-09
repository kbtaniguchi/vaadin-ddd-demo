package com.example.demo.domain.model.fudamentals.audit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreatedAt {
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime value;

    public String asTextDateTime() {
        return value.format(formatter);
    }
}
