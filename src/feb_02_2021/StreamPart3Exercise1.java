package feb_02_2021;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;

public class StreamPart3Exercise1 {
	
	public static double[] doubleArray = new Random().doubles(10).toArray();
	
	public static void main(String[] args) {

		
		System.out.println(DoubleStream.of(doubleArray).reduce((num1,num2) -> Math.sqrt(num1)+Math.sqrt(num2)).getAsDouble());
		System.out.println(DoubleStream.of(doubleArray).parallel().reduce((num1,num2) -> Math.sqrt(num1)+Math.sqrt(num2)).getAsDouble());
		
		
	}
	
	
}
