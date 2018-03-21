package com.hj.feign;

import com.hj.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Description:
 * User: JianHuangsh
 * Date: 2018-03-20
 * Time: 19:16
 */
@FeignClient(value = "web", fallback = HelloHystrix.class)
public interface Ihello {

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String say();

}
