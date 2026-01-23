public class ArrayAggregation {

    static int sumOfArray(int[] arr) {

        int sum = 0;
        for(int i : arr){
            sum += i;
        }

        return sum;
    }

    static int maxElement(int[] arr) {

        if (arr.length <= 0) return 0;
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        return max;
    }

    static int minElement(int[] arr) {

        if (arr.length <= 0) return 0;
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }

        return min;
    }

    static int countEvenNumbers(int[] arr) {

        int count = 0;
        for (int j : arr) {
            if (j%2 == 0) {
                count++;
            }
        }

        return count;
    }

    static int countOddNumbers(int[] arr) {

        int count = 0;
        for (int j : arr) {
            if (j%2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] input = {};

        System.out.println("----------------------------------------------");
        System.out.println("Digit Product: " + sumOfArray(input));
        System.out.println("Max Element: " + maxElement(input));
        System.out.println("Min Element: " + minElement(input));
        System.out.println("Count of Even Numbers: " + countEvenNumbers(input));
        System.out.println("Count of Odd Numbers: " + countOddNumbers(input));
        System.out.println("----------------------------------------------");

    }
}
