package com;

import java.util.Scanner;

public class Test5 {
	
	int k;
	int a,b,c;
	static int z=5;
	Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(z==5){
			Test5 t19 = new Test5();
			t19.in();
			t19.sw();
			
		}
		
		
	}

	
	public void in(){
		System.out.println("Enter 1 for ADD");
		System.out.println("Enter 2 for SUB");
		System.out.println("Enter 3 for MUL");
		System.out.println("Enter 4 for DIV");
		System.out.println("Enter 5 for EXIT");
		
		System.out.println("Enter the number:");
		k=reader.nextInt();
		

		
	}
	
	public void add(){
		
		System.out.println("Enter the First number:");
		 a=reader.nextInt();
		System.out.println("Enter the Second number:");
		b=reader.nextInt();
		
		c = a+b;
		
		System.out.println("Ans:"+ ""+ c);
		
		
	}
	
public void sub(){
		
		System.out.println("Enter the First number:");
		 a=reader.nextInt();
		System.out.println("Enter the Second number:");
		b=reader.nextInt();
		
		c = a-b;
		
		System.out.println("Ans:"+ ""+ c);
		
		
	}

public void mul(){
	
	System.out.println("Enter the First number:");
	 a=reader.nextInt();
	System.out.println("Enter the Second number:");
	b=reader.nextInt();
	
	c = a*b;
	
	System.out.println("Ans:"+ ""+ c);
	
	
}

public void div(){
	
	System.out.println("Enter the First number:");
	 a=reader.nextInt();
	System.out.println("Enter the Second number:");
	b=reader.nextInt();
	
	c = a/b;
	
	System.out.println("Ans:"+ ""+ c);
	
	
}
	
	public void sw(){
		
		switch(k) {
		
		case 1:
			Test5 t5 = new Test5();
			t5.add();
			
		break;
		
		
		case 2:
			Test5 t6 = new Test5();
			t6.sub();
			
		break;
		
		case 3:
			Test5 t7 = new Test5();
			t7.mul();
			
		break;
		case 4:
			Test5 t8 = new Test5();
			t8.div();
			
		break;
		
		case 5:
			z=7;
			
		break;
		
		
		default:
			
			System.out.println("Incorrect number");
		
		}
	
	
	}
	
	

}
