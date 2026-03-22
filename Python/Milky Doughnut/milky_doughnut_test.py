from unittest import TestCase
from milky_doughnut import *

class TestClass (TestCase):
	
	def test_number_of_even_numbers_even_number_contained(self):
		numbers = [7, 2, 1, 9, 3, 2, 8]
		actual = count_evens(numbers)
		expected = 3
		self.assertEqual(expected, actual)

	def test_number_of_even_numbers_no_even_number_contained(self):
		numbers = [7, 1, 9, 3]
		actual = count_evens(numbers)
		expected = 0
		self.assertEqual(expected, actual)

	def test_number_of_even_numbers_positive_and_negative_even_number_contained(self):
		numbers = [7, -2, 1, 9, 3, 2, -8]
		actual = count_evens(numbers)
		expected = 3
		self.assertEqual(expected, actual)

	def test_number_of_even_numbers_in_empty_list(self):
		numbers = []
		actual = count_evens(numbers)
		expected = 0
		self.assertEqual(expected, actual)

	def test_the_index_of_a_number_in_list(self):
		numbers = [7, -2, 1, 9, 3, 2, -8]
		actual = linear_search(numbers, 3)
		expected = 4
		self.assertEqual(expected, actual)

	def test_the_index_of_a_number_not_in_list(self):
		numbers = [7, -2, 1, 9, 3, 2, -8]
		actual = linear_search(numbers, 5)
		expected = -1
		self.assertEqual(expected, actual)

	def test_the_index_of_a_number_in_empty_list(self):
		numbers = []
		actual = linear_search(numbers, 5)
		expected = -1
		self.assertEqual(expected, actual)

	def test_first_n_perfect_squares(self):
		actual = squares(5)
		expected = [1, 4, 9, 16, 25]
		self.assertEqual(expected, actual)

	def test_first_negative_n_perfect_squares(self):
		actual = squares(-5)
		expected = [-1]
		self.assertEqual(expected, actual)

	def test_lists_are_equal(self):
		a = [7, 2, 1, 9, 3]
		b = [1, 2, 3, 7, 9]
		isEqual = arrays_equal(a, b)
		self.assertTrue(isEqual)

	def test_lists_are_not_equal(self):
		a = [7, 1, 1, 9, 3]
		b = [1, 2, 3, 7, 9]
		isEqual = arrays_equal(a, b)
		self.assertFalse(isEqual)

	def test_duplicates_are_removed(self):
		arr = [7, 1, 1, 9, 3]
		actual = remove_duplicates(arr)
		expected = [7, 1, 9, 3]
		self.assertEqual(expected, actual)


	def test_duplicates_with_zeros_are_removed(self):
		arr = [7, 1, 0, 1, 9, 0, 3]
		actual = remove_duplicates(arr)
		expected = [7, 1, 0, 9, 3]
		self.assertEqual(expected, actual)

	def test_2D_is_flattened_to_1D(self):
		numbers = [[1, 2, 3], [4, 5, 6], [7, 8, 9, 10]]
		actual = flatten(numbers)
		expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		self.assertEqual(expected, actual)

