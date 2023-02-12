package com.saikat.tycoons.exception;

import org.springframework.stereotype.Component;

@Component
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String errorCode;
    private String errorMessage;

    public BusinessException(String errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BusinessException() {

    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


}
