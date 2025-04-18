// is a special type used to define collections of constants.
public class EnumsInJava{
	public static void main(String[] args){
		AcountType type = AccountType.SAVINGS;
		
		switch(type){
			case SAVINGS:
			{
				System.out.println("Your saving account has been created with an interest of 2.5%");
			}
			break;
			
			case CHECKING:
			{
				System.out.println("Your checking account has been created with 0.0% interest rate");
			}
			break;
			
			case FIXED_DEPOSIT:
			{
				System.out.println("Your fixed deposit account has been created with an interest of 5%");
			}
			break;
		}
	}
}