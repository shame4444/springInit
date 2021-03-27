package com.example.springDemo1;

import com.example.springDemo1.Domain.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class SpringDemo1Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringDemo1Application.class, args);
		//Path path = Paths.get("src", "main", "resources", "Beans.xml");
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/Beans.xml");

		Car car = context.getBean("car", Car.class);
		System.out.println(car);
	}





}
