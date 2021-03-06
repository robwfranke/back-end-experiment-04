package nl.lotrac.bv.controller;

import nl.lotrac.bv.exceptions.BadRequestException;
import nl.lotrac.bv.exceptions.RecordNotFoundException;
import nl.lotrac.bv.exceptions.UsernameExistsException;
import nl.lotrac.bv.exceptions.UsernameNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
@CrossOrigin(origins = "http://localhost:3000")
public class ExceptionController {

    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<Object> exception(RecordNotFoundException exception) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(value = BadRequestException.class)
    public ResponseEntity<Object> exception(BadRequestException exception) {
        return ResponseEntity.badRequest().build();
    }

    @ExceptionHandler(value = UsernameNotFoundException.class)
    public ResponseEntity<Object> exception(UsernameNotFoundException exception) {
        return ResponseEntity.badRequest().build();
    }

    @ExceptionHandler(value = UsernameExistsException.class)
    public ResponseEntity<Object> exception(UsernameExistsException exception) {
        String message=exception.getMessage();
//        return ResponseEntity.badRequest().build();

        return new ResponseEntity<>(message, HttpStatus.UNAUTHORIZED);
    }



}
