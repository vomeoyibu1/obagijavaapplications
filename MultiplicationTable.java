import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		

		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		int i = 1;
		while( i <= 11; i++){
			System.out.println(num + " x " + i + " = " + num * i);
			i++;
		}
	}
}