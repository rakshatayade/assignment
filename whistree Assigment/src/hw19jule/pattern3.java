//1
//2 3
//4 5 6
//7 8 9 10
package hw19jule;

public class pattern3 
{
public static void main(String[] args) 
{
      int i,j,count=0;
		for(i=1;i<=4;i++)
			
		{
			for(j=1;j<=i;j++)
			{
				count++;
				System.out.print(count+"  ");
			}
			System.out.println("  ");
		}
	}
}
