package com.wxz.store.service.ex;

public class UserNameNotFoundException extends ServiceException {
    public UserNameNotFoundException() {
    }

    public UserNameNotFoundException(String message) {
        super(message);
    }

    public UserNameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNameNotFoundException(Throwable cause) {
        super(cause);
    }

    public UserNameNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
