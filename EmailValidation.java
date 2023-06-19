package Email;
import java.util.Scanner;
public class EmailValidation {

	public static void main(String[] args) {
	
				String[] emails = { "bujji@gmail.com","keerthi@yahoo.com",
				        "mouni@gov.in","kavya@gmail.com","parth@yahoo.com",
				        "ali@qq.com"};
				        
				    Scanner obj = new Scanner(System.in);
				    System.out.println("Enter the email Id to search: ");
				    String text = obj.nextLine();
				    boolean isPresent = false;
				   
				    for (String email : emails) 
				    {
				      if (email.contains(text)) 
				      {
				        isPresent = true;
				        break;
				      }
				    }

				    if (isPresent)
				    {
				      System.out.println("Email Exist: " +text);
				    } else 
				    {
				      System.out.println("Email not Exist: " + text);
				    }

				  }
	}


