package com.fahai.exceptions;

/**
 * Created by zhanghao on 16/10/11.
 */
public class BadRequestException extends RuntimeException {
    public BadRequestException(String msg) {
        super(msg);
    }
}
