package com.example.shiv.demo.shiv;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("shivanand");
		a.add("chchadi");
		a.add("software");
		a.add("Engineer");
		a.sort(null);
		System.out.println(a.indexOf("software"));
		for(String b:a) {
			
			System.out.println("the names in list are "+b);
		}
		
		
		// testing git hub
	

		
		
	}

}
