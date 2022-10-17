package com.Maven_project;

public class Pojo1  extends Pojo{
	
	public static void main(String[] args) {
		
		Pojo p=new Pojo();
		int i = p.getI();
		System.out.println(i);
		
		p.setI(67);
		int i2 = p.getI();
		System.out.println(i2);
	}

}
