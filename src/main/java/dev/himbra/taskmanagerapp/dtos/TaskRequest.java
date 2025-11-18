package dev.himbra.taskmanagerapp.dtos;

import dev.himbra.taskmanagerapp.enums.Priority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record TaskRequest(
         Long id,
         @NotBlank(message = "Title is required")
                 @Size(min = 30, message = "Title must be at least 30 characters long")
         String title,
         @NotEmpty(message = "Description is required")
                 @Size(max = 150, message = "Description must not exceed 150 characters")
         String description,
         @NotNull(message = "Priority is required")
         Priority priority,
         @NotNull(message = "Completed status is required")
         boolean completed,
         LocalDateTime dueDate
) {
}
