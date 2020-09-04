package com.libra.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Result {

    private boolean success;
    private int code;
    private String msg;
    private Object data;

    Result(ResultCode resultCode){
        this.success=resultCode.success;
        this.code=resultCode.code;
        this.msg=resultCode.message;
    }

    Result(ResultCode resultCode,Object data){
        this.success=resultCode.success;
        this.code=resultCode.code;
        this.msg=resultCode.message;
        this.data=data;
    }


}
