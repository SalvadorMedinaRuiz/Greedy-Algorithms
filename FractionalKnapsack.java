import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, ArrayList<Integer> values, ArrayList<Integer> weights, ArrayList<Double> prices) {
    	if (capacity == 0 || weights.isEmpty() == true) {
    		return 0;
    	}
    	Double maxPrice = Collections.max(prices);
    	int maxIndex = prices.indexOf(maxPrice);
    	double amount = Math.min(weights.get(maxIndex), capacity);
    	////////////////////////////
		////////////////////////////
        double value = maxPrice * amount; //fix?
        weights.remove(maxIndex);
        values.remove(maxIndex);
        prices.remove(maxIndex);
        capacity -= amount;
        return (value + getOptimalValue(capacity, values, weights, prices));
    	
    	}

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        ArrayList<Integer> values = new ArrayList<>();
        //values.add(n);
        ArrayList<Integer> weights = new ArrayList<>();
        //weights.add(n);
        ArrayList<Double> prices = new ArrayList<>();
        //int[] values = new int[n];
        //int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
        	values.add(scanner.nextInt());
        	weights.add(scanner.nextInt());
            //values[i] = scanner.nextInt();
            //weights[i] = scanner.nextInt();
        }
        for (int i2 = 0; i2 < n; i2++) {
        	double cost = (double) values.get(i2) / weights.get(i2);
        	prices.add(cost);
        }
        System.out.println(getOptimalValue(capacity, values, weights, prices));
    }
} 
