import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
		
        //2.6 This program calculates the product of three integers
        Scanner input = new Scanner(System.in);
        int x, y, z, result;
        
        System.out.print("Enter the first integer: ");
        x = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        y = input.nextInt();
        
        System.out.print("Enter the third integer: ");
        z = input.nextInt();
        
        result = x * y * z;
        System.out.printf("Product is %d%n", result);
    }
}