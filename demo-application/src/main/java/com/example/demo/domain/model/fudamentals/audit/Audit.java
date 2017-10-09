package com.example.demo.domain.model.fudamentals.audit;

public class Audit {
    CreatedAt createdAt;
    UpdatedAt updatedAt;

    public CreatedAt createdAt() {
        return createdAt;
    }

    public UpdatedAt updatedAt() {
        return updatedAt;
    }
}
