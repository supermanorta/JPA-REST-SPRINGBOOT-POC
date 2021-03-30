package com.JPAExample.JPAExample;
#added some comments to see if I can push to main from the mac
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Something to note, if scanBasePackages is used, it must declare all pacakges. Spring will no long behave as expected with out the ScanBasePackage.
@SpringBootApplication(scanBasePackages = {"com.JPAExample.JPAExample.dao","com.JPAExample.JPAExample.entity"})
public class JpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaExampleApplication.class, args);
	}
//DID not finish: left off on video 539. Spring Boot - Creating JPA DAO Implementation for REST API 
	
	// Have questions on how to include a controller while keeping the out the box stuff JPARepo gives you. So in combo of the both.
}
