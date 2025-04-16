package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No such course id")
public class CourseNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

	public CourseNotFoundException(String message) {
        super(message);
    }
}
