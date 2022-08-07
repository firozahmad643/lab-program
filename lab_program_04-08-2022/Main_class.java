
/* Q3 - Write a JAVA program which will generate the threads:
	      * To display 10 terms of Fibonacci series.
	      * To display 1 to 10 in reverse order.*/

package questionProgram;

public class Main_class extends Thread
{
	
		public static void main(String[] args) 		// main method
		{
			Main_class obj = new Main_class ();	   //creating the object of the class
			obj.start();	                      //start method is called
		}	
		public void run()												
		{
			fibonacci_series t1 = new fibonacci_series();				
			t1.fibon();
			System.out.println("\n");
			Reverse_number t2 = new Reverse_number();
			t2.revnum();
		}
}


