import java.util.Scanner;

// Parent class
class Number {
    int num;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
    }

    // factorial method in parent
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

// Child class
class Factorial extends Number {
    void displayFactorial() {
        // using super to call factorial method of parent class
        int result = super.factorial(num);
        System.out.println("Factorial of " + num + " = " + result);
    }
}

// Main class
public class SuperKeywordFactorial {
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.input();          // input number
        obj.displayFactorial(); // calculate and display factorial
    }
}
