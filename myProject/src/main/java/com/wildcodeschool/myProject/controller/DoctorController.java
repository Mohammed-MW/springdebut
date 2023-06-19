package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String WilliamHartnel() {
        return "William Hartnell <a href=\\>Home</a>";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String davidTennant() {
        return "David Tennant <a href=\\>Home</a>";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String jodieWhittaker() {
        return "Jodie Whittaker <a href=\\>Home</a>";
    }

}
