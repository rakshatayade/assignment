package homework15jul;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,rem,result=0;
		System.out.println("Enter your no");
		num=sc.nextInt();
		int arm=num;
		while(arm>0);
		{
			rem=arm%10;
			result=result+(arm*arm*arm);
			arm=arm/10;
		}
		if(num==result)
			System.out.println("Armstrong number");
		
			else
			{
				System.out.println("no armstrong number");
			}
		}
			

}