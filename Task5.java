package javabase;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to check the given number is prime or not.
		//A prime number is a natural number greater than 1 that has no positive divisors 
		//other than 1 and itself.
		//prime numbers--3,5,7,17,19,23
		int n=37;
		for(int i=2;i<n;i++)
		
		{
			if(n%i==0)
			{
				
			
			System.out.println(n+" is not a prime number");
			return;
		     }
			
		}
		     
			System.out.println(n+" is a prime number");
		     
		}
	}



//OUTPUT
//37 is a prime number
