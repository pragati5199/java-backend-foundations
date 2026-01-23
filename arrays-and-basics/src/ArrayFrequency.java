import java.util.Arrays;

public class ArrayFrequency {

    static void noOfOccurances(int[] arr) {

        boolean[] visited = new boolean[arr.length];
        for (int i=0;i<arr.length;i++){
            int count = 1;
            if (visited[i]) continue;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + "-----> " + count);
        }

    }

    static int maxFrequencyElement(int[] arr) {

        int max = 0;
        int maxVal = 0;
        boolean[] visited = new boolean[arr.length];

        if (arr.length == 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (visited[i]) continue;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if(max <= count){
                max = count;
                maxVal = arr[i];

            }
        }
        return maxVal;
    }

    static int minFrequencyElement(int[] arr) {

        int min = arr.length;
        int minVal = 0;
        boolean[] visited = new boolean[arr.length];

        if (arr.length == 0) return 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (visited[i]) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if(min >= count){
                min = count;
                minVal = arr[i];

            }
        }
        return minVal;
    }

    public static void main(String[] args) {

        int[] input = {0,1,1,0,2,2,1,2,3,4,4,4,4,4,4,4,0,4,4};
        System.out.println("Reversed Array : " + Arrays.toString(input));
        System.out.println("----------------------------------------------");
        System.out.println("No of Occurances of Unique elemts of array");
        noOfOccurances(input);
        System.out.println("Element cccured max times : " + maxFrequencyElement(input));
        System.out.println("Element cccured minn times : " + minFrequencyElement(input));
        System.out.println("----------------------------------------------");

    }
}
