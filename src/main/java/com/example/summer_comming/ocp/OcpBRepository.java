package com.example.summer_comming.ocp;

import org.springframework.stereotype.Component;

@Component
public class OcpBRepository implements OcpRepository {
    public void method1(){
        System.out.println("OcpBRepository method1");
    }
    public void method2(){
        System.out.println("OcpBRepository method2");
    }
}
