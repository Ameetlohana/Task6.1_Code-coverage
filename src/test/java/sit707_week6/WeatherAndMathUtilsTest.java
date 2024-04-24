package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222332999";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Ameet";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
	    // Test an odd number to ensure it's not considered even
	    Assert.assertFalse(WeatherAndMathUtils.isEven(3));
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    	
    }
    @Test
    public void testWeatherAdvice_Warn() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 3.5));
    }
    @Test
    public void testIsEven_OddNumber() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
    }
    @Test
    public void testIsPrime_PrimeNumber() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
    }
    @Test
    public void testSumUpTo_PositiveNumber() {
        Assert.assertEquals(15, ConditionalLoopsUtils.sumUpTo(5));
    }
    @Test
    public void testCountEvenNumbers_EvenNumbers() {
        int[] nums = {2, 4, 6, 8, 10};
        Assert.assertEquals(5, ConditionalLoopsUtils.countEvenNumbers(nums));
    }
    
}
