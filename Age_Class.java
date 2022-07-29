package questionProgram;

import java.util.Scanner;

public class Age_Class {

	public static void main(String[] args) {
		int age;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		age = obj.nextInt();
		try {
			if(age < 18 )
			{
				throw new Age_Exception("Not a Valid Age.");
			}
			else
			{
				System.out.println("your age is valid ");
				System.out.println("age is ="+age);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
			
	}

}
