from unittest import TestCase
from day_three_task import *

class TestClass (TestCase):

	def test_when_expected_size_is_less_than_present_list_size(self):

		number = [10, 11, 12, 13, 14]
		actual = task_one(number, 2)
		expected = [10, 11]

		self.assertEqual(actual, expected)

	def test_when_expected_size_is_greater_than_present_list_size(self):

		number = [10, 11, 12]
		actual = task_one(number, 9)
		expected = [10, 11, 12, -1, -1, -1, -1, -1, -1]

		self.assertEqual(actual, expected)

	def test_when_expected_size_is_equal_to_present_list_size(self):

		number = [10, 11, 12]
		actual = task_one(number, 3)
		expected = [10, 11, 12]

		self.assertEqual(actual, expected)

	def test_for_largest_number_in_2D_array(self):

		number =[[45.2, 90.28, 77.1], [3.52, 9.86, 11.77], [7.7, 10, 22.33, 12]]
		actual = task_three(number)
		expected = [0,1]
		self.assertEqual(actual, expected)

	def test_the_number_of_characters(self):

		words = "AaaBBc"
		actual = task_two(words)
		expected = "A1a2B2c1"
		self.assertEqual(actual, expected)

	def test_for_another_of_the_number_of_characters(self):

		words = "EEEEnnnnnee"
		actual = task_two(words)
		expected = "E4n5e2"
		self.assertEqual(actual, expected)