package test24july;

import java.util.Scanner;

public class CollegePlacement 
{
	public static void main(String[] args)
	{ 
		
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter Number of Placement in CSE :  ");
	int cse=sc.nextInt();
	System.out.println("Enter Number of Placement in ECE :  ");
	int ece=sc.nextInt();
	System.out.println("Enter Number of Placement in MECH :  ");
	int mech=sc.nextInt();
	if(cse>0&&ece>0&&mech>0)
	{
		if(cse>ece&&cse>mech)
		{
			System.out.println("Highst Placement CSE : " +cse);
		}
		else if(ece>cse&&ece>mech)
		{
			System.out.println("Highst Placement CSE : " +cse);
		}
	}
	
	
	
	}

}
