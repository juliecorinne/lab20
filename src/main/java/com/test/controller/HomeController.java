package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","message","Hello World");

    }

    @RequestMapping("welcome")

    public ModelAndView helloWorld2()
    {
        return new
                ModelAndView("welcome2","message","Hello World2");

    }

    @RequestMapping("coffeeRegistration")
    public ModelAndView coffeeRegMethod(@RequestParam("FName") String fName,
                                        @RequestParam("LName") String lName,
                                        @RequestParam("eMail") String email,
                                        @RequestParam("pN") String phoneN,
                                        @RequestParam("pWord") String passW){

        String name = "Hello " + fName;
        return new ModelAndView("viewName", "helloMessage", name);


    }

    @RequestMapping("getInfo")
    public ModelAndView getUserInfo(){
        String welcomeMessage = "Please provide your information!";

        return new ModelAndView("coffeeRegForm", "display", welcomeMessage);
    }

}
