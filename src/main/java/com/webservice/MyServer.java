package com.webservice;


import javax.xml.ws.Endpoint;

public class MyServer {
    public static void main(String[] args) {

       String address = "http://localhost:4000/math";
       Endpoint.publish(address,new MathServiceImpl());

    }
}