//Caculating the product of Odd integers

public class OddProduct {
    public static void main(String[] args) {
        long product = 1;
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }
        System.out.println("Product of odd integers from 1 to 15: " + product);
    }
}