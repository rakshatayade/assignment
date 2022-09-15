//q2)	Find all prime number between 400 to 300


package assignment6aug;

public class PrimeNumber 
{
public static void main(String[] args) {
			int a=400;
			int b=300; 
			
		while(a>b)
			 {
			int  flag = 0;
			 for(int j = 2; j <= b/2; j++)
			 {
				 if(a % j == 0)
				 {
	                 flag =1;
	                 break;
	             }
	         }

	         if (flag==0)
	             System.out.print(a + " ");
	         a--;
	     }
		}
	}
	

