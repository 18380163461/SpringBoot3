package com.example.demo.base;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-25 19:20
 */
public class BaseResponse<T> {
    T result;
    private String code;
    private String message;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BaseResponse() {
        code = "0";
        message = "成功";
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
