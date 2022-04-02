package com.zhuys.common.result;

/**
 * @author zhuys
 * @company tydic
 * @Description 响应枚举状态码
 * @create 2022-04-01
 */
public enum ResultCode {

    // 成功
    SUCCESS(200),

    // 失败
    FAIL(400),

    // 未认证（签名错误）
    UNAUTHORIZED(401),

    // 接口不存在
    NOT_FOUND(404),

    // 服务器内部错误
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
