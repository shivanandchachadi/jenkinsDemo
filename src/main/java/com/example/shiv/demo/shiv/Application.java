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
		a.add("12");
		a.sort(null);
		System.out.println(a.indexOf("shivanand"));
		Set set=new TreeSet<String>();
		
		for(String b:a) {
			set.add(b);
			
			System.out.print("  "+b);
		}
		
		System.out.println("set values "+ set);
		
		for(int i=0;i<10;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print(" ");
				System.out.print(" * ");
				
				
			}
			System.out.println(" ");
		}
		
		
		
		// testing git hub
	

		
		
	}

}
