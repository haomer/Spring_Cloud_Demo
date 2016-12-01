package com.fahai.exceptions;

/**
 * Created by zhanghao on 16/9/30.
 */
public class DatabaseErrorException extends RuntimeException {
    public DatabaseErrorException(String msg) {
        super(msg);
    }
}
