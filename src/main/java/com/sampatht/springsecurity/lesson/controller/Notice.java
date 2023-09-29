package com.sampatht.springsecurity.lesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notice")
public class Notice {
  @GetMapping
  public String getInfo() {
    return "Account Notice Information";
  }
}
