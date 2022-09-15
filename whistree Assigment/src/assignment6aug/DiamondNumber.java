//q1)

// Diamond number pattern with star border 

//*1* 
//*121* 
//*12321* 
//*1234321* 
//*123454321* 
//*1234321* 
//*12321* 
//*121* 
//*1*
package assignment6aug;

public class DiamondNumber {

		public static void main(String[] args) {
			 int i, j;
			    System.out.println("*");
			    for(i=1; i<=5; i++)
			    {
			    	System.out.print("*");
			        for(j=1; j<=i; j++)
			        {
			        	System.out.print(j);
			        }

			        for(j=i-1; j>=1; j--)
			        {
			        	System.out.print(j);
			        }
			        System.out.print("*");
			        System.out.println();
			     
			    }

			    for(i=5-1; i>=1; i--)
			    {
			    	System.out.print("*");
			        for(j=1; j<=i; j++)
			        {
			        	System.out.print(j);
			        }

			        for(j=i-1; j>=1; j--)
			        {
			        	System.out.print(j);
			        }
			        System.out.print("*");
			        System.out.println();
			    }
			    System.out.print("*");
			}

		}


