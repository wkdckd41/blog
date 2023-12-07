package com.blog.api.exception;

import lombok.Getter;

@Getter
public class InvalidRequest extends BlogException{

    private static final String MESSAGE = "잘못된 요청입니다.";

    public InvalidRequest() {
        super(MESSAGE);
        addValidation(fieldName, message);
    }

    public InvalidRequest(String fieldName, String message) {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 400;
    }
}
