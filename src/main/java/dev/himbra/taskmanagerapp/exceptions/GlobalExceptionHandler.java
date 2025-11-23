package dev.himbra.taskmanagerapp.exceptions;

import dev.himbra.taskmanagerapp.dtos.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Response<String>> handleRuntimeException(RuntimeException ex) {
        logger.error("Unexpected runtime exception: {}", ex.getMessage(), ex);
        Response<String> body = new Response<>(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                ex.getMessage(),
                null
        );
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
    }
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Response<String>> handleNotFoundException(NotFoundException ex) {
        logger.warn("NotFoundException: {}", ex.getMessage());
        Response<String> body = new Response<>(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                null
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }
}
