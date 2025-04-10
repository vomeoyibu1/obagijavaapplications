//Factorials

public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-5s %-20s%n", "N", "Factorial");
        for (int n = 1; n <= 20; n++) {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.printf("%-5d %-20d%n", n, factorial);
        }
    }
}