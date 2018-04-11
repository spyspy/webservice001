package com.webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class TestClient {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:4000/math?wsdl");
            QName qname = new QName("http://webservice.com/","MathServiceImplService");
            Service service = Service.create(url,qname);

            MathService ms = service.getPort(MathService.class);
            System.out.println(ms.add(11,15));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
