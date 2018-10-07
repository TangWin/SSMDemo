package com.tang.result;



public class ResultUtil {

    /**
     * 返回成功时传入的参数
     * @param object
     * @return
     */
    public static ResultMap success(Object object){
        ResultMap result= new ResultMap();
        result.setStatus("0");
        result.setMsg("success");
        result.setData(object);
        return result;    }

    /**
     * 提供给部分不需要出參的接口
     * @return
     */
    public static ResultMap success(){
        return success(null);
    }

    /**
     * 自定义错误信息
     * @param code
     * @return
     */

    public static ResultMap error(String code,String msg){
        ResultMap result = new ResultMap();
        result.setStatus(code);
        result.setMsg(msg);
        result.setData(null);
        return result;    }

    public static ResultMap error(ExceptionEnum exceptionEnum){
        ResultMap result = new ResultMap();
        result.setStatus(exceptionEnum.getCode());
        result.setMsg(exceptionEnum.getMsg());
        result.setData(null);

        return result;

    }
}
