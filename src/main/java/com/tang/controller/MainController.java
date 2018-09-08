package com.tang.controller;

import com.tang.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author TW
 */
@Controller
@RequestMapping("main")
public class MainController {

    @Autowired
    private MainService mainService ;

    @RequestMapping("/main")
    public String main() {
        return "index";
    }


    @RequestMapping("/getMainMsg")
    @ResponseBody
    public String getMainMsg() {
        return mainService.getMainMsg();
    }
}
