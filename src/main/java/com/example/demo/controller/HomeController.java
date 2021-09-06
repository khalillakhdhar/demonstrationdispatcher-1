package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
@GetMapping("")
ModelAndView acceuil()
{
ModelAndView page=new ModelAndView("index.html");
return page;
}
@GetMapping("types")
ModelAndView types()
{
ModelAndView mv=new ModelAndView("types.html");
return mv;

}
}
