package com.cg.gmall.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

  //  @Autowired


    @RequestMapping(value = "/trade")
    public String trade(){

        return "index";
    }

}
