package io.github.hobbstech.commons.utilities.exceptions;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.NoSuchElementException;

@ControllerAdvice
@RestController
@ConditionalOnProperty(value = "hobbstech.commons.default-exception-resolver.enabled",
        havingValue = "true", matchIfMissing = true)
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(org.springframework.security.access.AccessDeniedException.class)
    public final ResponseEntity<ErrorMessage> handleAccessDeniedException(org.springframework.security.access.AccessDeniedException ex, WebRequest request) {
        ErrorMessage errorDetails = new ErrorMessage(new Date(), ex.getMessage(), request.getDescription(false), ex.getClass().getName());
        ex.printStackTrace();
        return new ResponseEntity<>(errorDetails, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(AccessDeniedException.class)
    public final ResponseEntity<ErrorMessage> handleAccessDeniedException(AccessDeniedException ex, WebRequest request) {
        ErrorMessage errorDetails = new ErrorMessage(new Date(), ex.getMessage(), request.getDescription(false), ex.getClass().getName());
        ex.printStackTrace();
        return new ResponseEntity<>(errorDetails, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(InvalidRequestException.class)
    public final ResponseEntity<ErrorMessage> handleInvalidRequestException(InvalidRequestException ex, WebRequest request) {
        ErrorMessage errorDetails = new ErrorMessage(new Date(), ex.getMessage(), request.getDescription(false), ex.getClass().getName());
        ex.printStackTrace();
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RecordNotFoundException.class)
    public final ResponseEntity<ErrorMessage> handleRecordNotFoundException(RecordNotFoundException ex, WebRequest request) {
        ErrorMessage errorDetails = new ErrorMessage(new Date(), ex.getMessage(), request.getDescription(false), ex.getClass().getName());
        ex.printStackTrace();
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public final ResponseEntity<ErrorMessage> handleNoSuchElementException(NoSuchElementException ex, WebRequest request) {
        ErrorMessage errorDetails = new ErrorMessage(new Date(), ex.getMessage(), request.getDescription(false), ex.getClass().getName());
        ex.printStackTrace();
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IllegalAccessException.class)
    public final ResponseEntity<ErrorMessage> handleIllegalAccessException(IllegalAccessException ex, WebRequest request) {
        ErrorMessage errorDetails = new ErrorMessage(new Date(), ex.getMessage(), request.getDescription(false), ex.getClass().getName());
        ex.printStackTrace();
        return new ResponseEntity<>(errorDetails, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(IllegalOperationException.class)
    public final ResponseEntity<ErrorMessage> handleIllegalOperationException(IllegalOperationException ex, WebRequest request) {
        ErrorMessage errorDetails = new ErrorMessage(new Date(), ex.getMessage(), request.getDescription(false), ex.getClass().getName());
        ex.printStackTrace();
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(NullPointerException.class)
    public final ResponseEntity<ErrorMessage> handleIllegalOperationException(NullPointerException ex, WebRequest request) {
        ErrorMessage errorDetails = new ErrorMessage(new Date(), ex.getMessage(), request.getDescription(false), ex.getClass().getName());
        ex.printStackTrace();
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
