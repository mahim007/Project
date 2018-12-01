package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam(value = "id", defaultValue = "100") Integer id,
                       @RequestParam(value = "name", defaultValue = "Ashraful") String name){

        return id.toString()+" "+name;
    }

    @ResponseBody
    @RequestMapping(value = "/test/{id}/{name}", method = RequestMethod.GET)
    public String pathVar(@PathVariable("id") String id,
                          @PathVariable("name") String name){

        return "You entered: "+id+" "+name;
    }

    @RequestMapping(value = {"/index", "/"})
    public String homepage(){
        return "index";
    }


    @RequestMapping(value = "/registration")
    public String registration(){
        return "registration";
    }
}
