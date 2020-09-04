package com.libra.common.entity;

public enum ResultCode {

    /** success code 10000
        error code 10001
        unauthenticated code 10002
        unauthorized code 10003

    */

    SUCCESS(true,10000,"操作成功"),
    ERROR(false,10001,"操作失败"),
    UNAUTHENTICATED(false,10002,"您还未登陆了"),
    UNAUTHORIZED(false,10003,"权限不足"),
    SERVER_ERROR(false,99999,"系统繁忙，请稍后尝试");

    boolean success;
    int code;
    String message;

    ResultCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }


}
