package pl.sokolow.testtask.prevapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import  pl.sokolow.testtask.prevapp.service.*;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		System.out.println("TEST 1");
		
		SpringApplication.run(MainApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SquareServiceConfig.class);
		
		SquareService squareService = ctx.getBean(SquareService.class);
		
		List<Double> squaredDigits = squareService.squareList();

		System.out.println(Arrays.toString(squaredDigits.toArray()));
	}
}
