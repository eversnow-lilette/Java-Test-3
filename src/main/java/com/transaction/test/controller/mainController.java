package com.transaction.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dominique Obispo
 */

@RestController
public class mainController {

    @GetMapping("/")
    public String index() {
        return "Greetings!";
    }

    @GetMapping("/errorMessage")
    public String error() {
        return "Error";
    }

    @GetMapping("/networkFail")
    public String networkFailure() {
        return "Network Failure";
    }
}
