package hw14jul;

public class SumEvenNumber 
{
	public static void main(String[] args)
	{
		int sum=0;
		for( int i=1; i<=10; i++)
			
		{
			if(i%2==0)
			{
				sum=i+sum;
				}
		}
			System.out.println("Sum of all even number 1 to 10 is :" +sum);
	
			
			
	}}