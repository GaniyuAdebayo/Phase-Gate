import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Level5TasksTest{

	@Test
	public void testPrimeNumbersAreReturned(){
		int [] numbers = {5, 9, 3, 6, 2};
		int [] actual = Level5Tasks.taskOne(numbers);
		int [] expected = {5, 3, 2};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testOutputDoesNotContainNegativeNumbers(){
		int [] numbers = {5, -9, 3, -6, 2, -11};
		int [] actual = Level5Tasks.taskTwo(numbers);
		int [] expected = {5, 0, 3, 0, 2, 0};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testTheOutputArrayHasTheZerosSorted(){
		int [] numbers = {5, 0, 3, 0, 2, 0};
		int [] actual = Level5Tasks.taskThree(numbers);
		int [] expected = {5, 3, 2, 0, 0, 0};
		assertArrayEquals(expected, actual);

	}

	@Test
	public void testTheOutputArrayHasBeenSortedToEvenAndOdd(){
		int [] numbers = {45, 60, 3, 10, 9, 22};
		int [][] actual = Level5Tasks.taskFive(numbers);
		int [][] expected = {{45, 3, 9}, {60, 10, 22}};
		assertArrayEquals(expected, actual);

	}

	@Test
	public void testThatAnArrayIsPalindrome(){
		int [] numbers = {45, 0, 8, 0, 45};
		boolean expected = Level5Tasks.taskSix(numbers);
		assertTrue(expected);
	}

	@Test
	public void testThatAnArrayIsNotPalindrome(){
		int [] numbers = {45, 1, 8, 0, 45};
		boolean expected = Level5Tasks.taskSix(numbers);
		assertFalse(expected);
	}

	@Test
	public void testNumberReturnedArePerfectSquares(){
		int [] numbers = {4, 7, 9, 10, 16, 18};
		int [] actual = Level5Tasks.taskSeven(numbers);
		int [] expected = {4, 9, 16};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testNumberNonPerfectSquaresAreReplacedWithNegativeOne(){
		int [] numbers = {4, 7, 9, 10, 49, 6};
		int [] actual = Level5Tasks.taskEight(numbers);
		int [] expected = {4, -1, 9, -1, 49, -1};
		assertArrayEquals(expected, actual);
	}


}