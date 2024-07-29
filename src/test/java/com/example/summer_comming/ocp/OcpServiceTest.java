package com.example.summer_comming.ocp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OcpServiceTest {

    @Autowired
    private OcpService ocpService;

    @Test
    public void testOcpService() {
        OcpARepository ocpARepository = new OcpARepository();
        OcpBRepository ocpBRepository = new OcpBRepository();
        OcpService ocpService = new OcpService(ocpARepository);
        ocpService.getMethod1();
        ocpService.getMethod2();
    }

}