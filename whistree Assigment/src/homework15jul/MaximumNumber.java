package homework15jul;

import java.util.Scanner;

public class MaximumNumber
{

	public static void main(String[] args) 
	{
		int a,b,c,d,max;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Three Integer");
	      a=sc.nextInt();
	      b=sc.nextInt();
	      c=sc.nextInt();
	      d=sc.nextInt();
	      
	      
	      if(a>b)
	      {
	    	  if(a<c)
	    		  max=a;
	    	  else
	    	  max=c;
	      }
	      else 
	      {
	    	  
	    	  if(a>c)
	    		  max=b;
	    	  else
	    		  max=c;
	    	  {
		    	  
		    	  if(a>d)
		    		  max=d;
		    	  else
		    		  max=b;
	      }
	      System.out.println("Largest Number: " + max);
	      
	      }
	}
}

