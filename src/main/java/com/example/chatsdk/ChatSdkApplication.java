package com.example.chatsdk;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatSdkApplication {

    @Value("${server.port}")
    private String port;

    @Value("${spring.data.mongodb.uri}")
    private String dbUri;

    @Value("${spring.profiles.active}")
    private String profile;

    public static void main(String[] args) {
        SpringApplication.run(ChatSdkApplication.class, args);
    }

    @PostConstruct
    public void printEnvVars() {
        System.out.println("🚀 Server running on port: " + port);
        System.out.println("🛢️ MongoDB URI: " + dbUri);
        System.out.println("🌍 Active Profile: " + profile);
    }
}
