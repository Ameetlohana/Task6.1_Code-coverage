package sit707_week6;

public class ConditionalLoopsUtils {
	 // Function with a simple conditional loop (for loop)
    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
 // Function with a conditional loop and a conditional statement inside (while loop)
    public static int countEvenNumbers(int[] nums) {
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] % 2 == 0) {
                count++;
            }
            i++;
        }
        return count;
    }


}
