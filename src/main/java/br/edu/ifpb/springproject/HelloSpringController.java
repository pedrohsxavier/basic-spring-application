package br.edu.ifpb.springproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {
    @RequestMapping("/hello")
    public String get() {
        return "Olá, Pedro Xavier";
    }
}
