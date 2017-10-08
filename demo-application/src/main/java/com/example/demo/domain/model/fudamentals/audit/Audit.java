package com.example.demo.domain.model.fudamentals.audit;

public class Audit {
    CreatedAt createdAt;
    UpdatedAt updatedAt;

    public Audit(CreatedAt createdAt,
                 UpdatedAt updatedAt) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public CreatedAt createdAt() {
        return createdAt;
    }

    public UpdatedAt updatedAt() {
        return updatedAt;
    }
}
