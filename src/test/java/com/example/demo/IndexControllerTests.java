package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

public class IndexControllerTests {

    public static RestTemplate restTemplate = new RestTemplate();

    static String url = "http://10.211.55.10:8082/index";

    public static void main(String[] args) {
        int index = 10;
        for (int i = 0; i < index; i++) {
            String body = restTemplate.getForEntity(url, String.class).getBody();
            System.out.println(body);
        }
    }

}
