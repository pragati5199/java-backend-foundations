public class NumberLogic {
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 121;

        System.out.println("Reverse: " + reverse(num));
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Digit Count: " + countDigits(num));
    }
}
