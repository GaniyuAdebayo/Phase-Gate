import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateRemovalTest{

	@Test
	public void testDuplicateNumbersAreRemoved_duplicatePresent(){
		int [] number = {9, 2, 3, 2, 1};
		int [] actual = DuplicateRemoval.nonDuplicateNumber(number);
		int [] expected = {9, 3, 1};
		assertArrayEquals(actual, expected);
	}

	@Test
	public void testDuplicateNumbersAreRemoved_duplicateNotPresent(){
		int [] number = {9, 5, 3, 2, 1};
		int [] actual = DuplicateRemoval.nonDuplicateNumber(number);
		int [] expected = {9, 5, 3, 2, 1};
		assertArrayEquals(actual, expected);
	}

	@Test
	public void testDuplicateNumbersAreRemoved_allDuplicates(){
		int [] number = {9, 9, 9, 9, 9};
		int [] actual = DuplicateRemoval.nonDuplicateNumber(number);
		int [] expected = {};
		assertArrayEquals(actual, expected);
	}

	@Test
	public void testDuplicateNumbersAreRemoved_emptyArray(){
		int [] number = {};
		int [] actual = DuplicateRemoval.nonDuplicateNumber(number);
		int [] expected = {};
		assertArrayEquals(actual, expected);
	}

}