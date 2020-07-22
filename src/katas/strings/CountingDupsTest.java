package katas.strings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CountingDupsTest {

	@Test
	public void testContainsDups() {
		assert(CountingDups.containsDups("abbcdeefeg", 1));
	}
	
	@Test
	public void testDoesNotContainsDups() {
		assertFalse(CountingDups.containsDups("abcdefg", 0));
	}
	
	@Test
	public void testGetZeroItems() {
		assertEquals(0, CountingDups.getDuplicateCount("abcdefg"));
		assertEquals(0, CountingDups.getDuplicateCount(""));
	}
	
	@Test
	public void testGetOneItem() {
		assertEquals(1, CountingDups.getDuplicateCount("aabcdefg"));
		assertEquals(1, CountingDups.getDuplicateCount("abacdefg"));
	}
	
	@Test
	public void testGetTwoItem() {
		assertEquals(2, CountingDups.getDuplicateCount("aaabcdcefg"));
		assertEquals(2, CountingDups.getDuplicateCount("abacdefgg"));
	}

}
