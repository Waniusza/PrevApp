package pl.sokolow.testtask.prevapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import pl.sokolow.testtask.prevapp.SquareCounter;

public class SquareService {
	List<Double> digits;
	
	public void init() {
		digits = new ArrayList<Double>(Arrays.asList(
			1.0, 2.0, 3.0, 4.0 ));  
	}

    public  List<Double> squareList() {
        return squareList(digits);
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