package com.tang.controller;

import com.tang.service.MainService;
import com.tang.users.service.UsersService;
import com.tang.util.GsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @Autowired
    private UsersService usersService ;



    @RequestMapping("/main")
    public String main() {
        return "index";
    }


    @RequestMapping("/getMainMsg")
    @ResponseBody
    public String getMainMsg() {
        return mainService.getMainMsg();
    }


    @RequestMapping("/getUsersAll")
    @ResponseBody
    public String getUsersAll(@RequestParam Map<String , Object> requestMap)throws Exception {
        return GsonUtils.toJson(usersService.getUsersAll(requestMap));
    }
}
