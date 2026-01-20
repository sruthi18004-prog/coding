public class PrimeNum{
    public static void main(String[] args) {
        System.out.println("Prime numbers up to 50:");
        for (int num = 2; num <= 50; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}