package com.hj.hystrix;

import com.hj.feign.Ihello;
import org.springframework.stereotype.Component;

/**
 * Description:
 * User: JianHuangsh
 * Date: 2018-03-21
 * Time: 11:12
 */
@Component
public class HelloHystrix implements Ihello {

  @Override
  public String say() {
       return "error";
  }
}
