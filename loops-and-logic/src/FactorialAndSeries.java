public class FactorialAndSeries {

    static long factorial(int n) {

        long fact = 1;
        n = Math.abs(n);

        if (n == 0 || n ==1) return 1;

        for (int i = 2; i <= n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    static long sumOfFactorial(int n) {

        long fact = 1;
        long sum = 0;
        n = Math.abs(n);

        if (n == 0 || n ==1) return 1;

        for (int i = 1; i <= n; i++) {
            fact = fact*i;
            sum = sum + fact;
        }
        return sum;
    }

    static long sumOfFirstNNaturalNumbers(int n) {  return ((long) n *(n+1))/2;
    }

    static long sumOfFirstNNaturalEvenNumbers(int n) {

        if (n <= 1) return 0;
        if(n % 2 == 0)  return ((long) n *(n+2)/4);
        else return ((long) (n-1)*(n+1)/4);
    }

    static long sumOfFirstNNaturalOddNumbers(int n) {

        if (n == 1) return 1;
        if (n <= 0) return 0;
        if(n % 2 == 0)  return ((long) n * n/4);
        else return ((long) (n-1)*(n-1)/4);
    }

    public static void main(String[] args) {
        int[] input = {0,1,-1,5,10,20};

        for (int num : input) {
            System.out.println("----------------------------------------------");
            System.out.println("Factorial of  " + num + " is : " + factorial(num));
            System.out.println("Sum of Factorial of  " + num + " is : " + sumOfFactorial(num));
            System.out.println("Sum of Natural numbers till  " + num + " is : " + sumOfFirstNNaturalNumbers(num));
            System.out.println("Sum of Natural even numbers till  " + num + " is : " + sumOfFirstNNaturalEvenNumbers(num));
            System.out.println("Sum of Natural odd numbers till  " + num + " is : " + sumOfFirstNNaturalOddNumbers(num));
            System.out.println("----------------------------------------------");
        }
    }
}
