package com.example.shiv.demo.shiv;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

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
		a.add("engineer");
		a.add("engineer");
		
		System.out.println("before sort "+a.indexOf("shivanand"));
		//a.sort(null);
		System.out.println(a.indexOf("shivanand"));
		Set set=new TreeSet<String>();
		
		for(String b:a) {
			set.add(b);
			
			System.out.print("  "+b);
		}
		
		System.out.println("set values "+ set);
		
		
		
		
		// testing git hub
	

		
		
	}

}
