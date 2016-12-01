package com.fahai.exceptions;

/**
 * Created by zhanghao on 16/9/30.
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String msg) {
        super(msg);
    }
}
