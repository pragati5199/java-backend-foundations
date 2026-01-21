public class NumberLogic {
    static int reverse(int n) {
        int rev = 0;
        n = Math.abs(n);
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        n = Math.abs(n);
        return n == reverse(n);
    }

    static int countDigits(int n) {
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum  = sum + rem;
        }
        return sum;
    }

    static int productOfDigits(int n) {
        n = Math.abs(n);
        int product = 1;

        if (n == 0) return 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            product  = product * rem;
        }
            return product;
    }

    public static void main(String[] args) {
        int[] input = {121,234,-7899,0,1,12345};

        for (int num : input) {
            System.out.println("----------------------------------------------");
            System.out.println("Reverse: " + reverse(num));
            System.out.println("Is Palindrome: " + isPalindrome(num));
            System.out.println("Digit Count: " + countDigits(num));
            System.out.println("Digit Sum: " + sumOfDigits(num));
            System.out.println("Digit Product: " + productOfDigits(num));
            System.out.println("----------------------------------------------");
        }
    }
}
