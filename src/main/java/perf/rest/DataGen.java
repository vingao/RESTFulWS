package perf.rest;

import java.math.BigDecimal;
import java.util.Date;

public class DataGen {
	public static void main(String[] args) {
		Date date = new Date();
		long time = date.getTime();
		System.out.println("[");
		for (long i = 1; i<100; i++) {			
			//System.out.println("["+new Date(time + i*3600*1000*24)+","+rand(100)+"],");
			//System.out.println("["+(time + i*3600*1000*24)+","+rand(100)+"],");
			System.out.println("[\"2014/01/02\","+rand(100)+"],");
		}
		System.out.println("]");
	}

	private static int rand(int upperLimit) {
		return new BigDecimal(Math.random() * upperLimit).intValue();
	}
}
