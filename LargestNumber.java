import java.util.*;
/* 2
 * 
 * 21 2 
 */
public class LargestNumber {
    private static String largestNumber(ArrayList<String> a) {
        //write your code here
        String yourSalary = ""; //creates an empty string that represents our Salary
        while (a.isEmpty() != true) {
        	String maxNumber  = Collections.max(a); //grabs the largest string in a and puts it into maxNumber. BIG PROBLEM. FIRST MAX NUM IS 21
        	for (int i = 0; i < a.size(); i++) { //goes through the entire a array
        		if (isBetter(a.get(i), maxNumber)) { //compares number and number2
        			maxNumber = a.get(i); //current string in a is the new maxNumber  			
        		}
        	}
    		yourSalary += maxNumber;//adds the maxNumber string to yourSalary. Ex.) maxNumber = "21", so yourSalary = "" to = "21"
    		a.remove(maxNumber); //removes the current maxNumber string from the array a;
        }
        return yourSalary;
    }
    
    private static boolean isBetter(String a, String b) { //a = 21 (a.get(0) = 21), b = 21 (Collections.max(a) = 21)
    	String con = a + b;
    	String con2 = b + a;
    	int conNum = Integer.parseInt(con);
    	int conNum2 = Integer.parseInt(con2);
    	
    	if (conNum > conNum2) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.next());
        }
        System.out.println(largestNumber(a));
    }
}

