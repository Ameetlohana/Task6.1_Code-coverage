package sit707_week6;
import org.junit.Assert;
import org.junit.Test;

public class ConditionalLoopsUtilsTest {
	  @Test
	    public void testSumUpTo() {
	        // Test case for summing numbers up to 5
	        Assert.assertEquals(15, ConditionalLoopsUtils.sumUpTo(5));
	        
	        // Additional test cases can be added for other inputs
	        // For example, test summing numbers up to 10
	        Assert.assertEquals(55, ConditionalLoopsUtils.sumUpTo(10));
	    }

	    @Test
	    public void testCountEvenNumbers() {
	        // Test case for counting even numbers in an array
	        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        Assert.assertEquals(5, ConditionalLoopsUtils.countEvenNumbers(nums1));
	        
	        // Additional test cases can be added for different arrays
	        // For example, test with an array containing only odd numbers
	        int[] nums2 = {1, 3, 5, 7, 9};
	        Assert.assertEquals(0, ConditionalLoopsUtils.countEvenNumbers(nums2));
	    }

}
