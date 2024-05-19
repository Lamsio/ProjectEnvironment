package com.java.webmvc.controller;

import com.java.webmvc.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private GoodsMapper goodsMapper;


    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return goodsMapper.getGoodsById(1).toString();
    }
}