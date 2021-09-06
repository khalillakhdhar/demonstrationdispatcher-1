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
@GetMapping("controllers")
String getControl()
{
return	"l annotation Controller signifie Nous pouvons annoter les contrôleurs classique sous forme de composants";

}
}
