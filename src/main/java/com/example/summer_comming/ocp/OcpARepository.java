package com.example.summer_comming.ocp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OcpARepository implements OcpRepository{
    public void method1(){
        System.out.println("OcpARepository method1");
    }
    public void method2(){
        System.out.println("OcpARepository method2");
    }
}
