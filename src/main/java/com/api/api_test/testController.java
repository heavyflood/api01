package com.api.api_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class testController {

    @GetMapping("/")
    public String getString() {

        try {
            InetAddress addr = InetAddress.getLocalHost();
            String strIP = addr.getHostAddress();
            String strHostName = addr.getHostName();
            return "return from "+ strHostName + "(" + strIP + ")";
        }catch(UnknownHostException e){
            return "Unknnnnown Host";
        }
    }
}
