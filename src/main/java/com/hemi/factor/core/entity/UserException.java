package com.hemi.factor.core.entity;

/**
 * UserException : 用户自定义异常
 *
 */
public class UserException extends RuntimeException {

    /**
     * 异常发生时间
     */
    private long date = System.currentTimeMillis();

    public long getDate() {
        return date;
    }
}
