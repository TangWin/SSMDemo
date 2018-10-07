package com.tang.controller;

import com.tang.result.ExceptionEnum;
import com.tang.result.ExceptionHandle;
import com.tang.result.ResultMap;
import com.tang.result.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ExceptionHandle exceptionHandle;

    @RequestMapping(value = "/Result",method = RequestMethod.POST)
    public ResultMap getResult(@RequestParam("name") String name, @RequestParam("pwd") String pwd){
        ResultMap result = ResultUtil.success();
        try {
            if (name.equals("ttw")){
                result =  ResultUtil.success();
            }else if (name.equals("wwt")){
                result =  ResultUtil.error(ExceptionEnum.logername);
            }else{
                int i = 1/0;
            }
        }catch (Exception e){
            result =  exceptionHandle.exceptionGet(e);
        }
        return result;
    }


}
