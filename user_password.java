
//write a program to accept User ID and password checks if the password id valid or not based on password policies mention below 
                                            // password should not contain any space.
                                            // password should contain at least one digit(0-9).
                                            // password should contain at least one lower case letter (a-z).
                                            // password should contain at least one upper case letter (A-Z).
                                            // password should contain at least one special character (@,#,%,&,!,$,etc...).
package questionProgram;

import java.util.Scanner;

public class user_password {

	String id,pass; 
	private  String password,user_Id;
	
	static int pass_length=9;
	 Scanner sc= new Scanner(System.in);
	 
	 public static void main(String[] args) // main method
	 {
			
			user_password ob = new user_password(); //creating object
			ob.accept_user_id(); //  calling object

     }
	
	public void accept_user_id() //class for accepting the user_id from user
	{  
	
		System.out.println("Enter your user id :");
		System.out.println("the user_id should contain 8 character");
		
		try  // try block checks for exception
		{  
			id = sc.next();
			if(id.length() != 8)
			{
				throw new Exception("Enter the Valid Id here .");	
			}
			else
			{
					password();		
			}
		}
		catch(Exception e) // catch block will handle the occur exception  
		{
			System.out.println(e);
			System.out.println("The user id Shoud be of 8 character.");
			
		}
				
	}
	
	
		public void password() // class for accepting password
		{
			// password conditions
			
			System.out.println("Password should not contain any space.\n"
					+ "Password should contain at least one digit(0-9).\n"
					+ "Password length should be between 0 to 9 characters.\n"
					+ "Password should contain at least one lowercase letter(a-z).\n"
					+ "Password should contain at least one uppercase letter(A-Z).\n"
					+ "Password should contain at least one special character ( @, #, %, &, !, $, etc….)."); 
	               pass = sc.next();
	               
				try // try block for password
				{ 
					if (is_Valid_Password(pass)) {
			            System.out.println("Password is valid: " + pass);
			            show();
			        } else {
			        	throw new Exception("Not a valid password: ");
			           }
				}
				catch(Exception e1) //catch block will handle the exception
				{
					System.out.println(e1);
				}
			
		}
		
		
		public static boolean space(String password)  //  condition for checking space
		{
		     if (password.contains(" "))  // condition for space
		          {
                      return true;
		          }
		     return false;
		}
		
		
	  public static boolean is_Valid_Password(String password)  //  condition for checking password length
		{

		        if (password.length() < pass_length) return false;  // condition for checking length of password

		        int charCount = 0;
		        int numCount = 0;
		        for (int i = 0; i < password.length(); i++) 
		        {
		            char ch = password.charAt(i);
		            if (is_Numeric(ch)) numCount++;// condition for number of password contain digit
		            else if (up_Letter(ch)) charCount++;// condition for character are in upper case
		            else if (lo_Letter(ch)) charCount++;// condition for character are in lower case
		            else if((password.contains("@") || password.contains("#") // condition for special character
			                 || password.contains("!") || password.contains("~")
			                 || password.contains("$") || password.contains("%")
			                 || password.contains("^") || password.contains("&")
			                 || password.contains("*") || password.contains("(")
			                 || password.contains(")") || password.contains("-")
			                 || password.contains("+") || password.contains("/")
			                 || password.contains(":") || password.contains(".")
			                 || password.contains(", ") || password.contains("<")
			                 || password.contains(">") || password.contains("?")
			                 || password.contains("|")));
		            else return false; // character if nothing is true
		        }
		        
		        return (charCount >= 2 && numCount >= 2);
		   }
	  
			
		    public static boolean up_Letter(char ch) //  condition for checking password containing capital letter or not
		    {
		        ch = Character.toUpperCase(ch);
		        return (ch >= 'A' && ch <= 'Z');
		    }
			
		    public static boolean lo_Letter(char ch) // condition for checking password containing small letter or not
		    {
		        ch = Character.toLowerCase(ch);
		        return (ch >= 'a' && ch <= 'z');
		    }

		
		    public static boolean is_Numeric(char ch)  //  condition for checking password containing number or not
		    {

		        return (ch >= '0' && ch <= '9');
		    }
		    
		    public void show() // method to display user id and password
			{
				
				System.out.println("Your Id : "+id);
				System.out.println("Your Password : "+pass);
				
			}

}


