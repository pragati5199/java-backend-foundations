import java.util.Arrays;

public class ArrayAggregation {

    static int sumOfArray(int[] arr) {

        int sum = 0;
        for(int i : arr){
            sum += i;
        }

        return sum;
    }

    static int maxElement(int[] arr) {

        if (arr.length == 0) return 0;
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        return max;
    }

    static int minElement(int[] arr) {

        if (arr.length == 0) return 0;
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
    static int[] reverseArray(int[] arr) {

        int size = arr.length;

        if (size == 0) return arr;

        int j = size-1;
        for (int i=0;i<size/2;i++){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        return arr;

    }

    static int[] reverseArrayWithExtraSpace(int[] arr) {

        int size = arr.length;
        int[] output = new int[size];
        if (size == 0) return arr;

        int j = size-1;
        for (int i=0;i<size;i++){
            output[i] = arr[j];
            j--;
        }

        return output;

    }

    static int[] rotateArrayLeftByK(int[] arr, int k) {

        int n = arr.length;
        if (n == 0) return arr;

        k = k%n;  // handles k>n
        if(k == 0) return arr;

        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        reverseArray(arr,0,n-1);

        return arr;

    }

    static int[] rotateArrayRightByK(int[] arr, int k) {

        int n = arr.length;
        if (n == 0) return arr;

        k = k%n;  // handles k>n
        if(k == 0) return arr;

        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);

        return arr;

    }

    private static void reverseArray(int[] arr, int l, int r) {

        while(l<r){

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

    }


    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6,7,8,9};
        int k =4;
        System.out.println("----------------------------------------------");
        System.out.println("Digit Product: " + sumOfArray(input));
        System.out.println("Max Element: " + maxElement(input));
        System.out.println("Min Element: " + minElement(input));
        System.out.println("Count of Even Numbers: " + countEvenNumbers(input));
        System.out.println("Count of Odd Numbers: " + countOddNumbers(input));
        System.out.println("Reversed Array : " + Arrays.toString(reverseArray(input)));
        System.out.println("Reversed Array : " + Arrays.toString(reverseArrayWithExtraSpace(input)));
        System.out.println("Rotate Left by K : " + Arrays.toString(rotateArrayLeftByK(input,k)));
        System.out.println("Rotate Left by K : " + Arrays.toString(rotateArrayRightByK(input,k)));
        System.out.println("----------------------------------------------");

    }
}
