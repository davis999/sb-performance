package io.davis.performance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Davis on 17/7/28.
 */
@RestController
public class HelloController {

  @GetMapping("/")
  public String sayHello() {
    return "Hello world";
  }
}
