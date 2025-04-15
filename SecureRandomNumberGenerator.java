import java.security.SecureRandom;

public class SecureRandomNumberGenerator{
	public static void main(String[] args){
	    SecureRandom secureRan = new SecureRandom();
		
		Boolean option = secureRan.nextBoolean();
		System.out.printf("Do you love Java? %b",option);
		
		int integer = secureRan.nextInt();
		System.out.printf("The integer is %d%n",integer);
		
		int integerWithBound = secureRan.nextInt(100) + 1;
		System.out.printf("The integer is %d%n",integerWithBound);
		
		long number = secureRan.nextLong();
		System.out.printf("The integer is %d%n",number);
		
		long numberWithBound = secureRan.nextLong(8_000_000_000L);
		System.out.printf("The integer is %d%n",numberWithBound);
		
		
		
	}
}