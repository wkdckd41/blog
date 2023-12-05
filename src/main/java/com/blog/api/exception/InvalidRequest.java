package com.blog.api.exception;

public class InvalidRequest extends BlogException{

    private static final String MESSAGE = "잘못된 요청입니다.";

    public InvalidRequest() {
        super(MESSAGE);
    }
}
