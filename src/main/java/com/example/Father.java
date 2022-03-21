package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/api/v1/testintbea", produces = MediaType.APPLICATION_JSON_VALUE)
public class Father {

    @GetMapping
    public ResponseEntity<String> find() {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/api/testemsg"; // testemsg - testeprefixo
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());

        return new ResponseEntity<>("ok", HttpStatus.OK); //testando commit
    }
}