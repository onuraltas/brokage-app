package com.challenge.exceptions;

import com.challenge.enums.ExceptionMessage;
import lombok.Data;

@Data
public class BrokageException extends RuntimeException {

    private String code;

    public BrokageException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BrokageException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage.getErrorMessage());
        this.code = exceptionMessage.getErrorCode();
    }

    public BrokageException(ExceptionMessage exceptionMessage, Object... values) {
        super(exceptionMessage.getErrorMessage().formatted(values));
    }

}
