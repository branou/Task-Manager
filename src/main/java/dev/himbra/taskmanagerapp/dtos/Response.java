package dev.himbra.taskmanagerapp.dtos;

public record Response<T>(
        int statusCode,
        String message,
        T data
) {
}
