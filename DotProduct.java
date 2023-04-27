import java.util.*;

public class DotProduct {
    private static long maxDotProduct(Integer[] a, Integer[] b) {
        //write your code here
        long result = 0;
        int arrayLength = a.length;
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b, Collections.reverseOrder());
        for (int i = 0;i < arrayLength; i++) {
        	result += ((long)a[i] * b[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
    }
}

