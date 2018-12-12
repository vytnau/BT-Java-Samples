package lt.bt.java.test.sample;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SumClassTest {

	@Test
	public void test_sum_5_7() {
		SumClass sumClass = new SumClass();
		int sk1 = 5;
		int sk2 = 7;
		int expected = 12;
		int result = sumClass.sum(sk1, sk2);
		assertEquals(expected, result);		
	}
	
	@Test
	public void test_sum_2_1() {
		SumClass sumClass = new SumClass();
		int sk1 = 5;
		int sk2 = -7;
		int expected = -2;
		int result = sumClass.sum(sk1, sk2);
		assertEquals(expected, result);		
	}

}
