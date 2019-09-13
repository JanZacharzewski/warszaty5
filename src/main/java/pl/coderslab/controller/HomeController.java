package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = "/", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String index(){
        return "<h1>Warsztat 5, API SERVER ĄĄ</h1>";
    }
}
