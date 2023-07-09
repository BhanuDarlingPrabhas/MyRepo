package com.core.WrapperClasses;

public class WrapperClassEx {

	public static void main(String[] args) {
		
		long l = 34;
		Long l1 = l;
		Long l2 = new Long(l);
		Long l3 = Long.valueOf(l);
		Long l4 = Long.parseLong("22");
		System.out.println(l4);
		
		long k = l1;
		long k1 = l1.longValue();
		long k2 = Long.parseLong("11");
		long k3 = Long.valueOf(k);
		System.out.println(k2);
		
		double d = 43;
		Double d1 = d;
		Double d2 = new Double(d);
		Double d3 = Double.valueOf(l);
		Double d4 = Double.parseDouble("33");
		
		double D = d1;
		double D1 = d1.longValue();
		double D2 = Double.parseDouble("11");
		double D3 = Double.valueOf(k);
		
		
		
		

	}

}
