package com.example.demo.domain.model.fudamentals.audit;

import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
public class UpdatedAt {
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime value;

    public String asTextDateTime() {
        return value.format(formatter);
    }
}
