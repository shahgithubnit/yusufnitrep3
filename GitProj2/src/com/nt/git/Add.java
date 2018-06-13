package com.nt.git;

public class Add {

	public static void main(String[] args) {
		
		System.out.println("Welcome to github Yusuf");
		
		System.out.println("Welcome to github Bashi");
		
	
		for(int i=0;i<10;i++){
			
			System.out.println(i);
					
		}
		
		System.out.println("sum"+ new Math().sum(10,20));
		
		WishGenerator generate = new WishGenerator();
		
		System.out.println("msg"+generate.generateWishMsg("yusuf"));
		
		System.out.println("sub"+ new Sub().sub(100,50));
	}

}
