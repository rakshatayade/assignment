package hw14jul;

import java.util.Scanner;

public class ProductDigit {

	public static void main(String[] args) 
	{
	int n,y,sum=0;
	System.out.println("Enter any no");
	Scanner r=new Scanner(System.in);
	n=r.nextInt();
	while(n>0)
	{
		y=n%10;
		sum=sum+y;
		n=n/10;
	}
	System.out.println("Sum of Digit:" +sum );
		
		
	}
	
	}

