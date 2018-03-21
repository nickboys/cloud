package com.hj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: JianHuangsh
 * Date: 2018-03-20
 * Time: 19:20
 */
@RestController
public class helloC {
         @RequestMapping("/hello")
         public String hello(){
           System.err.print("sssss");
           return "hello world";
         }
}
