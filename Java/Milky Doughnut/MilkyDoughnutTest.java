import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MilkyDoughnutTest{

	@Test
	public void testNumberOfEvenNumbers_evenNumberContained(){
		int [] numbers = {7, 2, 1, 9, 3, 2, 8};
		int actual = MilkyDoughnut.countEvens(numbers);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void testNumberOfEvenNumbers_noEvenNumberContained(){
		int [] numbers = {7, 1, 9, 3};
		int actual = MilkyDoughnut.countEvens(numbers);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testNumberOfEvenNumbers_positiveAndNegativeEvenNumberContained(){
		int [] numbers = {7, -2, 1, 9, 3, 2, -8};
		int actual = MilkyDoughnut.countEvens(numbers);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void testNumberOfEvenNumbers_emptyArray(){
		int [] numbers = {};
		int actual = MilkyDoughnut.countEvens(numbers);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testTheIndexOfANumberInArray(){
		int [] numbers = {7, -2, 1, 9, 3, 2, -8};
		int actual = MilkyDoughnut.linearSearch(numbers, 3);
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void testTheIndexOfANumberNotInArray(){
		int [] numbers = {7, -2, 1, 9, 3, 2, -8};
		int actual = MilkyDoughnut.linearSearch(numbers, 5);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void testTheIndexOfANumberNotInEmptyArray(){
		int [] numbers = {};
		int actual = MilkyDoughnut.linearSearch(numbers, 5);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void testFirstnPerfectSquares(){
		int [] actual = MilkyDoughnut.squares(5);
		int [] expected = {1, 4, 9, 16, 25};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testFirstNegativeNPerfectSquares(){
		int [] actual = MilkyDoughnut.squares(-5);
		int [] expected = {-1};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testArraysAreEqual(){
		int [] a = {7, 2, 1, 9, 3};
		int [] b = {1, 2, 3, 7, 9};
		boolean isEqual = MilkyDoughnut.arraysEqual(a, b);

		assertTrue(isEqual);
	}

	@Test
	public void testArraysAreNotEqual(){
		int [] a = {7, 1, 1, 9, 3};
		int [] b = {1, 2, 3, 7, 9};
		boolean isEqual = MilkyDoughnut.arraysEqual(a, b);
		assertFalse(isEqual);

	}

	@Test
	public void testDuplicatesAreRemoved(){
		int [] arr = {7, 1, 1, 9, 3};
		int [] actual = MilkyDoughnut.removeDuplicates(arr);
		int [] expected = {7, 1, 9, 3};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testDuplicatesWithZerosAreRemoved(){
		int [] arr = {7, 0, 1, 1, 0, 9, 3};
		int [] actual = MilkyDoughnut.removeDuplicates(arr);
		int [] expected = {7, 0, 1, 9, 3};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test2DIsFlattenedTo1D(){
		int [][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
		int [] actual = MilkyDoughnut.flatten(numbers);
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		assertArrayEquals(expected, actual);		

	}
}