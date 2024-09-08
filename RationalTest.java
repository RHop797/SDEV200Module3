import java.math.BigInteger;
import java.util.Scanner;

public class RationalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the numerator of the first rational number: ");
            BigInteger num1 = new BigInteger(scanner.nextLine());
            System.out.print("Enter the denominator of the first rational number: ");
            BigInteger denom1 = new BigInteger(scanner.nextLine());

            System.out.print("Enter the numerator of the second rational number: ");
            BigInteger num2 = new BigInteger(scanner.nextLine());
            System.out.print("Enter the denominator of the second rational number: ");
            BigInteger denom2 = new BigInteger(scanner.nextLine());

            Rational r1 = new Rational(num1, denom1);
            Rational r2 = new Rational(num2, denom2);

            System.out.println("First Rational Number: " + r1);
            System.out.println("Second Rational Number: " + r2);
            System.out.println("Sum: " + r1.add(r2));
            System.out.println("Difference: " + r1.subtract(r2));
            System.out.println("Product: " + r1.multiply(r2));
            System.out.println("Quotient: " + r1.divide(r2));

            System.out.println("Comparison: " + r1.compareTo(r2));
        } finally {
            scanner.close(); 
        }
    }
}
