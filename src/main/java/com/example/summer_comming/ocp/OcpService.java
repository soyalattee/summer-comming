package com.example.summer_comming.ocp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OcpService {
/**
 * before use OcpARepository
 * want to as is change OcpBRepository
 * this two repository have same process. 기능이 같음
 *
 * void method1(): "OcpAMethod1" "OcpBMethod1"
 * void method2(): "OcpAMethod2" "OcpBMethod2"
 *
 * => ocpService의 코드는 변경되지않고 OcpRepository들을 바꿔서 쓸 수 있게 하자!
 */
    @Autowired
   private OcpRepository ocpRepository;


    void getMethod1(){
        ocpRepository.method1();
    }
    void getMethod2(){
        ocpRepository.method2();
    }
}
