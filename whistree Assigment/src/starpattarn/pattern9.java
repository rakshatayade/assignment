package starpattarn;

import java.util.Scanner;

public class pattern9 
{
	public static void main(String[] args)
	{
       for(int i=1;i<=5;i++)
			{
    	   for(int sp=4;sp>=i;sp--)
    	   { 
    		   System.out.println(" ");
    	   }
			
			for(int j=1;j<=i;j++)
			{

				System.out.print(j);
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
}
}