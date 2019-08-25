package pl.sokolow.testtask.prevapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		System.out.println("TEST 1");
		runSquaring();
	}

	public static void runSquaring() {
		
		List<Double> digitals = new ArrayList<Double>(Arrays.asList(
				1.0, 2.0, 3.0, 4.0 ));
		
		List<Double> squaredDigitals = squareList(digitals);

		System.out.println(Arrays.toString(squaredDigitals.toArray()));
	}

	public static List<Double> squareList(List<Double> digits) {
		return digits
			.parallelStream()
			.filter(d -> d != null && d > 2 )
			/*
			Wariant dla sytuacji, gdy mamy pewnośś, że count zwróci wartość inną niż null;
			.map(d -> SquareCounter.count(d).get())
			*/
			.map(SquareCounter::count)
			.filter(d -> d.isPresent())
			.map(d -> d.get())
			
			.collect(Collectors.toList()); 
	}

}
