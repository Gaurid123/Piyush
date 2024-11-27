package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class NewconfigeClient2Application {

	public static void main(String[] args)
	{
		System.out.println("This is client");
		System.out.println("This is client222");
		SpringApplication.run(NewconfigeClient2Application.class, args);
	}

}
