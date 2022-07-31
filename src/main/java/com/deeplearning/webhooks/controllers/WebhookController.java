package com.deeplearning.webhooks.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/api/webhook")
    public ResponseEntity<String> webhook(@RequestBody String requestBody) {
        System.out.println("Webhook is triggered");
        System.out.println(requestBody);
        return new ResponseEntity<String>(requestBody, HttpStatus.OK);
    }
}
