package com.example.demo.service;

public class SalaException extends RuntimeException {

    public enum ErrorCode {
        CLASSROOM_COULD_NOT_BE_SAVED,
        CLASSROOM_WITH_SAME_NAME_ALREADY_EXISTS,
    }

    private ErrorCode error;

    private SalaException(ErrorCode error) {
        this.error = error;
    }

    public ErrorCode getError() {
        return error;
    }
    public static SalaException classroomWithSameNameAlreadyExists() { return new SalaException(ErrorCode.CLASSROOM_WITH_SAME_NAME_ALREADY_EXISTS);}

    public static SalaException classroomCouldNotBeSaved() { return new SalaException(ErrorCode.CLASSROOM_COULD_NOT_BE_SAVED);}
}