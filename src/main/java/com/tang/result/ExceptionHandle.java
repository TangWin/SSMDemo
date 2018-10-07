package com.tang.result;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@ControllerAdvice
@EnableWebMvc
public class ExceptionHandle {


    /**
      * 判断错误是否是已定义的已知错误，不是则由未知错误代替
     * @param e
     * @return
     * */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultMap exceptionGet(Exception e){
        System.out.println("出现了异常："+e.getMessage());
        if(e instanceof DescribeException){
            DescribeException MyException = (DescribeException) e;
            return ResultUtil.error(MyException.getCode(),MyException.getMessage());
        }

        return ResultUtil.error(ExceptionEnum.UNDEFINED);      }





}
