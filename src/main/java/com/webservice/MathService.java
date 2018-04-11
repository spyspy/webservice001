package com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MathService {
    @WebMethod
    public int add(int a, int b);

    @WebMethod
    public int minus(int a, int b);

    @WebMethod
    public int multiple(int a, int b);
}
