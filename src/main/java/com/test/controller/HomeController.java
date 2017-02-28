package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

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
                                        @RequestParam("pWord") String passW) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/CoffeeHouse";
        String userName = "chirpus";
        String password = "grant";

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, password);

        PreparedStatement pst = con.prepareStatement("insert into userInformation(firstName, lastName, email, phoneNumber, password)" + "values(?,?,?,?,?)");

        pst.setString(1, fName);
        pst.setString(2, lName);
        pst.setString(3, email);
        pst.setString(4, phoneN);
        pst.setString(5, passW);

        pst.executeUpdate();

        con.close();

        String name = "Hello " + fName;
        return new ModelAndView("viewName", "helloMessage", name);


    }

    @RequestMapping("getInfo")
    public ModelAndView getUserInfo(){
        String welcomeMessage = "Please provide your information!";

        return new ModelAndView("coffeeRegForm", "display", welcomeMessage);
    }

}
