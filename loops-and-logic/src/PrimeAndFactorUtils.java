import java.util.ArrayList;
import java.util.List;

public class PrimeAndFactorUtils {

    static boolean isPrime(int n) {

        if (n ==2) return true;
        if (n <= 1) return false;
        for(int i=2;i<=(int) Math.sqrt(n);i++){
            if ((n%i) == 0)
                return false;
        }
        return true;
    }

    static List<Integer> getFactors(int n) {

        n = Math.abs(n);
        List<Integer> factor_list = new ArrayList<>();

        if (n == 0) {
            factor_list.add(0);
            return factor_list;
        }

        if (n == 1) {
            factor_list.add(1);
            return factor_list;
        }
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factor_list.add(i);
                if (i != n / i) {
                    factor_list.add(n / i);
                }
            }
        }
        return factor_list;
    }

    public static void main(String[] args) {
        int[] input = {121,234,-7899,0,1,12345};

        for (int num : input) {
            System.out.println("----------------------------------------------");
            System.out.println("Is " + num + " Prime? : " + isPrime(num));
            System.out.println("Factors of  " + num + " are : " + getFactors(num));
            System.out.println("----------------------------------------------");
        }
    }
}
