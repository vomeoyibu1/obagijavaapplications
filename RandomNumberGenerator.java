import java.util.Random;

public class RandomNumberGenerator{
	public static void main(String[] args){
	    Random ran = new Random();
		
		Boolean option = ran.nextBoolean();
		System.out.printf("Do you love Java? %b",option);
		
		int integer = ran.nextInt();
		System.out.printf("The integer is %d%n",integer);
		
		int integerWithBound = ran.nextInt(100) + 1;
		System.out.printf("The integer is %d%n",integerWithBound);
		
		long number = ran.nextLong();
		System.out.printf("The integer is %d%n",number);
		
		long numberWithBound = ran.nextLong(8_000_000_000L);
		System.out.printf("The integer is %d%n",numberWithBound);
		
	}
}