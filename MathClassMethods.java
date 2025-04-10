import java.util.Scanner;

public class MathClassMethods{
	public static void main(String[] args){
	Scanner scan = new Scanner (System.in);
	
	System.out.printf("Enter number: ");
	double num = scan.nextDouble();
	
	System.out.printf("The absolute value is %f%n", Math.abs(num));
	// Approximate
	System.out.printf("The rounded value is %d%n",Math.abs(Math.round(num)));
	
	System.out.printf("%f raised to the power of 2 is %f%n",num, Math.pow(num,2));
	System.out.printf("The square root of %f is %f%n",num,Math.sqrt(num));
	
	System.out.println("------------------------------------------");
	System.out.printf("Enter first number: ");
	double num1 = scan.nextDouble();
	
	System.out.printf("Enter second number: ");
	double num2 = scan.nextDouble();
	
	System.out.printf("The minimum number is %f%n",Math.min(num1,num2));
	System.out.printf("The maximum number is %f%n",Math.max(num1,num2));
	}
}