package br.com.wpsilva.addresswp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MyObjNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(MyObjNotFoundException e) {
        StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<StandardError> methodNotAllowed(HttpRequestMethodNotSupportedException e, HttpServletRequest request) {
        StandardError err = new StandardError(HttpStatus.METHOD_NOT_ALLOWED.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(err);
    }

}
