package com.practise.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class TestController {


    @Value("${lucky-word}")
    private String luckyWord;

    @GetMapping("/lucky-word")
    public ResponseEntity<String> luckyWord() {

        String str = "Todays lucky word is : " + luckyWord;

        return new ResponseEntity<>(str, HttpStatus.OK);

    }


}
