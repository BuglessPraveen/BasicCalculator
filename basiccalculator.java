import java.util.Scanner;

public class basiccalculator {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter first number: ");
		        double a = sc.nextDouble();
		        System.out.print("Enter second number: ");
		        double b = sc.nextDouble();
		        System.out.print("Choose operation (+ - * /): ");
		        char op = sc.next().charAt(0);

		        double result;
		        switch (op) {
		            case '+': result = a + b; break;
		            case '-': result = a - b; break;
		            case '*': result = a * b; break;
		            case '/':
		                if (b == 0) {
		                    System.out.println("Cannot divide by zero.");
		                    sc.close();
		                    return;
		                }
		                result = a / b;
		                break;
		            default:
		                System.out.println("Invalid operator.");
		                sc.close();
		                return;
		        }

		        System.out.println("Result: " + result);
		        sc.close();
		    }
	}
