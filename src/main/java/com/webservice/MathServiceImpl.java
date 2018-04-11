package com.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.webservice.MathService")
public class MathServiceImpl implements MathService {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int multiple(int a, int b) {
        return a*b;
    }
}
