package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    @GetMapping("hello")
    @ResponseBody
    public String helloQuery(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

//    @GetMapping("hello/{name}")
//    @ResponseBody
//    public String helloPath(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                            "<form method = 'post' action = '/hello'>" +
                                "<input type = 'text' name = 'name' />" +
                                "<input type = 'submit' value = 'Greet Me!' />" +
                            "</form>" +
                        "</body>" +
                "</html>";
        return html;
    }
}
