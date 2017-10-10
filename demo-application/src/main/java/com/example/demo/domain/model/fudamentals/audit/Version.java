package com.example.demo.domain.model.fudamentals.audit;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Version {
    Integer value;

    private Version(int value) {
        this.value = value;
    }

    public String asText() {
        return String.valueOf(value);
    }

    public static Version first() {
        return new Version(1);
    }
}
