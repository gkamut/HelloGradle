package com.jgoshfpv.jenkins.helloGradle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Gradle");
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	LocalDateTime dateTime = LocalDateTime.now();
	System.out.println(dateTime.format(formatter));
    }
}
