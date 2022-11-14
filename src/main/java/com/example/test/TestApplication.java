package com.example.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class TestApplication {


    public static void main(String[] args) {
        File file = new File("/Users/hjp/Desktop/照片 2/JGG_5086.JPG");
        System.out.println(file.length() / 1024);
    }

}
