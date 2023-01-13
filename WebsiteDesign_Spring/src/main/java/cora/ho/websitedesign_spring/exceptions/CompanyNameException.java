package cora.ho.websitedesign_spring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CompanyNameException extends RuntimeException{

    public CompanyNameException(String message) {
        super(message);
    }
}
