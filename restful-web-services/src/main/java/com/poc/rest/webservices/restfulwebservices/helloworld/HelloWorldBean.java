package com.poc.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

    private String helloWorld;
    public HelloWorldBean(String helloWorld) {
        this.helloWorld = helloWorld;
    }

    public String getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(String helloWorld) {
        this.helloWorld = helloWorld;
    }
}
