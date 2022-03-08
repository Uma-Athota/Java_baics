package com.training.cg;

public class Product {
	int id;
	String name;
	String desc;
	int cost;
	public static void main(String[] args) {
		Product p1=new Product();
		p1.id=24;
		p1.name="watch";
		p1.desc="aluminium coated waterproof material";
		p1.cost=2500;
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.desc);
		System.out.println(p1.cost);
		
	}

}
