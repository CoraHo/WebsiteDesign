package cora.ho.websitedesign_spring.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler
    public final ResponseEntity<?> handleCompanyNameException(CompanyNameException exception, WebRequest request) {
        CompanyNameExceptionResponse companyNameExceptionResponse = new CompanyNameExceptionResponse(exception.getMessage());
        return new ResponseEntity<>(companyNameExceptionResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public final ResponseEntity<?> handleCompanyNotFound(NotFoundException exception, WebRequest request) {
        NotFoundExceptionResponse notFoundExceptionResponse = new NotFoundExceptionResponse(exception.getMessage());
        return new ResponseEntity<>(notFoundExceptionResponse, HttpStatus.NOT_FOUND);
    }
}
