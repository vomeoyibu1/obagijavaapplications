import java.util.Scanner;

public class SwitchCaseStatement{
    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# To Load Data");
		System.out.println("Enter *310# To Check Balance");
		System.out.println("Enter *303# To Borrow Data");
		
		System.out.print("Enter Code: ");
		String option = input.nextLine();
		
		switch(option){
			case "*131#":
			{
				System.out.println("");
				System.out.println("Enter 1 for 1 Month Plan");
				System.out.println("Enter 2 for 2 Months Plan");
				System.out.println("Enter 3 for 3 Months Plan");
				System.out.println("Enter 4 for 4 Months Plan");
				System.out.println("");
				
				System.out.print("Enter Code: ");
		        int code = input.nextInt();
				
				switch(code){
			        case 1:
					{
						System.out.println("Your 1 month subscription hasd been activated");
					}
			        break;
			
			        case 2:
			        {
						System.out.println("Your 2 month subscription hasd been activated");
			        }
			        break;
			
			        case 3:
			        {
						System.out.println("Your 3 month subscription hasd been activated");
			        }
			        break;
			
			        case 4:
			        {
						System.out.println("Your 4 month subscription hasd been activated");
			        }
			        break;
					default:
					System.out.println("Invalid input");
				}
			}
			break;
			
			case "*310#":
			{
				System.out.println("Your balance is #702.97");
			}
			break;
			
			case "*303#":
			{
				System.out.println("");
				System.out.println("Enter 1 to borrow 1000");
				System.out.println("Enter 2 to borrow 2500");
				System.out.println("Enter 3 to borrow 4000");
				System.out.println("Enter 4 to borrow 5000");
				
				System.out.println("Enter code: ");
				int code = input.nextInt();
				
				switch(code){
					case 1:
					{
						System.out.println("Your account has been credited with 1000");
					}
					break;
					
					case 2:
					{
						System.out.println("Your account has been credited with 2500");
					}
					break;
					
					case 3:
					{
						System.out.println("Your account has been credited with 4000");
					}
					break;
					
					case 4:
					{
						System.out.println("Your account has been credited with 5000");
					}
					break;
					
					default:
					System.out.println("Invalid Input");
				}
			}
			break;
			default:
			System.out.println("Invalid input");
		}
	}
}