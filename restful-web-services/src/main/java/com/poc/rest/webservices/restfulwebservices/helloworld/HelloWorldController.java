package com.poc.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    //path variable example
    @GetMapping(path = "/hello-world/pathVariable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){

        return new HelloWorldBean(String.format("Hello World,  %s", name));
    }
}
