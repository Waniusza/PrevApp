package pl.sokolow.testtask.prevapp;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pl.sokolow.testtask.prevapp.service.SquareService;

@RunWith(SpringRunner.class)
// @WebAppConfiguration
@SpringBootTest
public class MainApplicationTests {
	private double PRECISION = 1e-12;


	@Autowired
	private SquareService squareService;

	@Test
	public void contextLoads() {
		
		List<Double> squared = squareService.squareList();
		
        assertEquals(2, squared.size());
        assertEquals(9.0, squared.get(0), PRECISION);
        assertEquals(16.0, squared.get(1), PRECISION);
	}	
}
