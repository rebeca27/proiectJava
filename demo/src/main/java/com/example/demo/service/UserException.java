//package com.example.demo.service;
//
//public class UserException extends RuntimeException {
//
//    public enum ErrorCode {
//        USER_NOT_FOUND,
//        USER_WITH_SAME_EMAIL_ALREADY_EXISTS,
//        ACCOUNT_ALREADY_EXISTS,
//        ACCOUNT_COULD_NOT_BE_SAVED,
//    }
//
//    private ErrorCode error;
//
//    private UserException(ErrorCode error) {
//        this.error = error;
//    }
//
//    public ErrorCode getError() {
//        return error;
//    }
//
//    public static UserException userNotFound() {
//        return new UserException(ErrorCode.USER_NOT_FOUND);
//    }
//
//    public static UserException userWithSameEmailAlreadyExists() { return new UserException(ErrorCode.USER_WITH_SAME_EMAIL_ALREADY_EXISTS);}
//    public static UserException userCouldNotBeSaved() { return new UserException(ErrorCode.USER_COULD_NOT_BE_SAVED);}
//    public static UserException accountAlreadyExists() { return new UserException(ErrorCode.ACCOUNT_ALREADY_EXISTS);}
//}