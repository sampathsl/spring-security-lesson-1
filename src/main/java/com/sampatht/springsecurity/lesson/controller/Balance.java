package com.sampatht.springsecurity.lesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balance")
public class Balance {
  @GetMapping
  public String getAccountInfo() {
    return "Account Balance Information";
  }
}
