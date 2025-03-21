package demo;

import java.util.Random;

public class Sample {
	public static void main(String[] args) {

		Random rn = new Random();
		int number = rn.nextInt(1000);
		System.out.println(number);
	}
}
