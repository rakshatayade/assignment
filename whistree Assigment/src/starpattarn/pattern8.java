package starpattarn;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter rows");
			int rows=sc.nextInt();
			for(int i=1;i<=rows;i++)
			{
				for(int sp=rows-1 ;sp>=i;sp--)
				{
					System.out.print(" ");
				}
				 for(int j=1;j<=2*i-1;j++)
				  {
					  if(j==1 || j==2*i-1  )
					  {
						  System.out.print("*");
					  }
					  else
						  System.out.print(" ");
				  }
				
				
				  System.out.println("");
			}
			for(int i=rows-1;i>=1;i--)
			{
				
				for(int sp=rows-1;sp>=i;sp--)
				{
					System.out.print(" ");
				}
				  for(int j=1;j<=2*i-1;j++)
				  {
					  if(j==1 || j==2*i-1 )
					  {
						  System.out.print("*");
					  }
					  else
						  System.out.print(" ");
				  }
				
				  System.out.println("");
			}
         }
    }