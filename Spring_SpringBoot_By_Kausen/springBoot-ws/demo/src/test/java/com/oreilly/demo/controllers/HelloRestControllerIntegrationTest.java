package com.oreilly.demo.controllers;

import com.oreilly.demo.entities.Greeting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloRestControllerIntegrationTest {

    @Test
    public void testHelloWithoutName(@Autowired TestRestTemplate testRestTemplate) {
        ResponseEntity<Greeting> entity = testRestTemplate.getForEntity("/rest", Greeting.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON, entity.getHeaders().getContentType());
        Greeting response = entity.getBody();
        if (response != null) {
            assertEquals("Hello World", response.getMessage());
        }

    }
    @Test
    public void testHelloWithName(@Autowired TestRestTemplate testRestTemplate) {
        Greeting response = testRestTemplate.getForObject("/rest?name=Dolly", Greeting.class);
        assertEquals("Hello Dolly", response.getMessage());
    }
}
