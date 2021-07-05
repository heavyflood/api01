package com.api.api_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/")
    public String getString() {
        return "hi~roo~!!";
    }
}
