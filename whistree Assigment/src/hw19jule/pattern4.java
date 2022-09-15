//A
//A B
//A B C
//A B C D
//A B C D E 
//A B C D E F 
package hw19jule;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		for(int i=1;i<=6;i++)
		{
			 ch='A';
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(ch+"   ");
			ch++;
			
			}
			System.out.println("");
		}
		

	}

}