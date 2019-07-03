package com.example.test.net.retrofit.errors;

/**
 * @classname：ServerException
 * @author：luozhipeng
 * @date：18/3/2019 14:49
 * @description： 处理服务器异常
 */
public class ServerException extends RuntimeException {
    private int errCode;
    private String message;

    public ServerException(int errCode, String msg) {
        super(msg);
        this.errCode = errCode;
        this.message = msg;
    }

    public int getErrCode() {
        return errCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
