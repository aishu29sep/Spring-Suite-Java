package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		int x ,y ,z ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers , to find the greatest");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>y && x>z) {
			System.out.println(x+" is greater");
		}
		else if(y>z) {
		      System.out.println(y+" is greater");
		}
		else {
			System.out.println(z+"is greater");
		}
		
		
		System.out.println("Aishwarya");
	}

}
