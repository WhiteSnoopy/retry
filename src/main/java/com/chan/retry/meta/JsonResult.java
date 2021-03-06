package com.chan.retry.meta;

import java.util.LinkedHashMap;

import org.springframework.util.Assert;

import com.chan.retry.constant.ResponseCode;

/**
 * json返回结果封装
 *
 * @author chanyun
 */
public class JsonResult extends LinkedHashMap<String, Object> {

    /**
     * 响应code，默认<code>ResponseCode.SUCCESS</code>
     */
    public static final String CODE = "code";

    /**
     * 执行coremail func返回的错误码
     */
    public static final String ERROR_CODE = "errorString";

    /**
     * 执行coremail func返回的错误码的subCode
     */
    public static final String SUB_ERROR_CODE = "subErrorCode";

    /**
     * 操作影响的数据
     */
    public static final String DATA = "data";

    /**
     * 额外的信息
     */
    public static final String OTHER = "other";

    /**
     *
     */
    private static final long serialVersionUID = 4004136263013658272L;

    public JsonResult() {
        setCode(ResponseCode.OK);
    }

    public JsonResult(ResponseCode responseCode) {
        setCode(responseCode);
    }

    public JsonResult(ResponseCode responseCode, String errorCode) {
        setCode(responseCode);
        put(ERROR_CODE, errorCode);
    }

    public ResponseCode getCode() {
        return (ResponseCode) get(CODE);
    }

    public void setCode(ResponseCode responseCode) {
        Assert.notNull(responseCode, "code must not be null!");
        put(CODE, responseCode.getCode());
    }

    public String getErrorCode() {
        return (String) get(ERROR_CODE);
    }

    public void setErrorCode(String errorCode) {
        put(ERROR_CODE, errorCode);
    }

    public Object getData() {
        return (String) get(DATA);
    }

    public void setData(Object data) {
        put(DATA, data);
    }

    public Object getOther() {
        return (String) get(OTHER);
    }

    public void setOther(Object other) {
        put(OTHER, other);
    }
}
