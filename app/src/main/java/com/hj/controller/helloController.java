package com.hj.controller;

import com.hj.feign.Ihello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: JianHuangsh
 * Date: 2018-03-20
 * Time: 19:18
 */
@RestController
@RequestMapping("/hello")
public class helloController {

     @Autowired
     private Ihello ihello;
      @RequestMapping(value = "/test",method = RequestMethod.GET)
      public String  test(){
          return ihello.say();
      }
}
