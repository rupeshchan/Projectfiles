package com;

//Greater & smaller of three numbers

import java.util.Scanner;

public class Test3 {
	int a=0;
	int b=0;
	int c=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
		Test3 t3 = new Test3();
		t3.input();
	    t3.greater();
		t3.lesser();
		new Test3().swap();		
		
	}
	
	public void input(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter First number:");
		if(reader.hasNextInt()){
			a=reader.nextInt();	
		}
		
		System.out.println("Enter second number:");
		if(reader.hasNextInt()){
			b=reader.nextInt();	
		}
		
		System.out.println("Enter third number:");
		if(reader.hasNextInt()){
			c=reader.nextInt();	
		}
	
		reader.close();
	}
	
	
	public void greater(){
		
		if((a>b) && (a>c)){
			
			System.out.println(a + " " + "A is Greater");
			
		}else if((b>a) && (b>c)){
			
			System.out.println(b + " " + "B is Greater");
		}else if((c>a) && (c>b)){
			
			System.out.println(c + " " + "C is Greater");
			
		}
		
		
			
		}
		
	
public void lesser(){
	if((a<b) && (a<c)){
		
		System.out.println(a + " " + "A is Lesser");
		
	}else if((b<a) && (b<c)){
		
		System.out.println(b + " " + "B is Lesser");
	}else if((c<a) && (c<b)){
		
		System.out.println(c + " " + "C is Lesser");
		
	}
	
		}
		

	
	//swapping two number without initializing third number

public void swap(){
	
	int x = 1001;
	int y = 25;
	
	x = x+y;
	y=x-y;
	x=x-y;
	
	System.out.println(x + " " + "X value");
	System.out.println(y+" "+"Y value");
	
	
	
}



	}
	
		
	
	
