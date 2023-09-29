package com.sampatht.springsecurity.lesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class Card {
  @GetMapping
  public String getInfo() {
    return "Account Card Information";
  }
}
