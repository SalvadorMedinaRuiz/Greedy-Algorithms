import java.util.*;

public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        //write your code here
        int sum = 0;
        int currentNum = 1;
        while (sum < n) {
        	sum += currentNum;
        	summands.add(currentNum);
        	currentNum += 1;
        }
        if (sum > n) {
        	int size = summands.size();
        	int lastNum = summands.remove(size - 1);
        	size = summands.size();
        	int exceedNums = sum - n;
        	int num = (summands.get(size - 1) + lastNum) - exceedNums;      	
        	summands.set(size  - 1, num);
        }
        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}

