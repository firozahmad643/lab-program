package questionProgram;
									
public class fibonacci_series 	 	
{
	public void fibon()	// method to perform fibonacci series										
	{
								
		int size=10,temp,a=0,b=1;									
		System.out.println("Displaying 10 terms of fibonacci series:");	
													
		do	                  // do-while loop to print fibonacci numbers														
		{
			temp = a + b;											
			a = b;
			b = temp;
			System.out.print(temp+" ,");							
			size--;
		}
		while(size>0);
	}
}
