package pl.sokolow.testtask.prevapp;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SquareStreamTest {
	private double PRECISION = 1e-12;

    @Test
    public void testStream(){
        List<Double> digitals = new ArrayList<Double>(Arrays.asList(
                0.0, null, 1.5, 2.0, 4.0, 10.0 ));
                
        List<Double> squared = MainApplication.squareList(digitals);

        assertEquals(2, squared.size());
        assertEquals(16.0, squared.get(0), PRECISION);
        assertEquals(100.0, squared.get(1), PRECISION);
    }
}