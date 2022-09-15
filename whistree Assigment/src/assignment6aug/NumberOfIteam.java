//q3) You have hundred items (1,2,3,...n) the price of each item 
//is the same as its number. i.e., item 1 is of 1 rs. Item 2 is of 2 rs. And so on.
//Calculate the total of the items.n value u can take from user



package assignment6aug;
import java.util.Scanner;
public class NumberOfIteam 
{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Item Number: ");
			int num=sc.nextInt();
			int total = 0;
			for(int i=1; i<=num; i++)
			{
				total=total+i;
			}
			
			System.out.println(+total);
			sc.close();
		}
	}

