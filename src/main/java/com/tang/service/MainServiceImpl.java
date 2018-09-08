package com.tang.service;

import org.springframework.stereotype.Service;

/**
 * @author TW
 */
@Service("mainService")
public class MainServiceImpl implements MainService {


    @Override
    public String getMainMsg() {
        return "hello My World！dear hongbao！";
    }
}
