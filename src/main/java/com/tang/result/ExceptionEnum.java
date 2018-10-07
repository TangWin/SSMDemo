package com.tang.result;

public class ExceptionEnum {
    public static final ExceptionEnum UNDEFINED = new ExceptionEnum("001", "未知错误");
    public static final ExceptionEnum logername = new ExceptionEnum("002", "用户名不存在");

    private String code;
    private String msg;
    ExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
