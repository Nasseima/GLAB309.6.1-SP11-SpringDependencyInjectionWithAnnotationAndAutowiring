package com.perscholars.GLAB3096.__SP11;

import com.perscholars.GLAB3096.__SP11.myServices.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.perscholars.GLAB3096.__SP11"})
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
		SpringApplication.run(Application.class, args);

		Coach theCoach = context.getBean((Coach.class));

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
