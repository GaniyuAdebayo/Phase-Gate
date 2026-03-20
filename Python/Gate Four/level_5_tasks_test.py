from unittest import TestCase
from level_5_tasks import *

class TestClass (TestCase):
	def test_prime_numbers_are_returned(self):
		numbers = [5, 9, 3, 6, 2]
		actual = task_one(numbers)
		expected = [5, 3, 2]
		self.assertEqual(expected, actual)

	def test_output_does_not_contain_negative_numbers(self):
		numbers = [5, -9, 3, -6, 2, -1]
		actual = task_two(numbers)
		expected = [5, 0, 3, 0, 2, 0]
		self.assertEqual(expected, actual)

	def test_the_output_array_has_the_zeros_sorted(self):
		numbers = [5, 0, 3, 0, 2, 0]
		actual = task_three(numbers)
		expected = [5, 3, 2, 0, 0, 0]
		self.assertEqual(expected, actual)
	
	def test_the_output_array_has_been_sorted_to_even_and_odd(self):
		numbers = [45, 60, 3, 10, 9, 22]
		actual = task_five(numbers)
		expected = [[45, 3, 9], [60, 10, 22]]
		self.assertEqual(expected, actual)

	def test_that_an_array_is_palindrome(self):
		numbers = [45, 0, 8, 0, 45]
		expected = task_six(numbers)
		self.assertTrue(expected)

	def test_that_an_array_is_not_palindrome(self):
		numbers = [45, 1, 8, 0, 45]
		expected = task_six(numbers)
		self.assertFalse(expected)

	def test_number_returned_are_perfect_squares(self):
		numbers = [4, 7, 9, 10, 16, 18]
		actual = task_seven(numbers)
		expected = [4, 9, 16]
		self.assertEqual(expected, actual)

	def test_number_non_perfect_squares_are_replaced_with_negative_one(self):
		numbers = [4, 7, 9, 10, 49, 6]
		actual = task_eight(numbers)
		expected = [4, -1, 9, -1, 49, -1]
		self.assertEqual(expected, actual)