package com.example.demo.domain.model.fudamentals.audit;

public class Audit {
    CreatedAt createdAt;
    UpdatedAt updatedAt;
    Version version;

    public CreatedAt createdAt() {
        return createdAt;
    }

    public UpdatedAt updatedAt() {
        return updatedAt;
    }

    public Version version() {
        return version;
    }
}
