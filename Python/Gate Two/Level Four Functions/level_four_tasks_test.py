from level_four_tasks_function import *
from unittest import TestCase

class TestClass (TestCase):

	def test_sum_of_two_numbers_are_equal(self):

		expected = task_one(4, 6)
		actual = 10
		self.assertEqual(expected, actual)

	def test_sum_of_positive_and_negative_are_equal(self):

		expected = task_one(9.3, 6)
		actual = 15.3
		self.assertEqual(expected, actual)

	def test_zero_is_even_number(self):
		expected = task_two(0)
		self.assertTrue(expected)

	def test_negative_7_is_not_even_number(self):
		expected = task_two(-7)
		self.assertFalse(expected)

	def test_square_of_negative_10_is_100(self):
		expected = task_three(-10)
		actual = 100
		self.assertEqual(expected, actual)

	def test_square_of_decimal_is_equal(self):
		expected = task_three(1.5)
		actual = 2.25
		self.assertEqual(expected, actual)

	def test_tha_zero_degree_celcius_gives_32degF(self):

		expected = task_four(0)
		actual = 32.0
		self.assertEqual(expected, actual)

	def test_that_negative_100_degree_celcius_gives_negative_148_degF(self):

		expected = task_four(-100)
		actual = -148
		self.assertEqual(expected, actual)

	def test_that_23_is_prime(self):
		expected = task_five(23)
		self.assertTrue(expected)

	def test_that_121_is_not_prime(self):
		expected = task_five(121)
		self.assertFalse(expected)

	def test_for_largest_when_all_are_negative(self):
		expected = task_six(-3, -54, -1)
		actual = -1
		self.assertEqual(expected, actual)

	def test_for_largest_when_all_are_positive(self):
		expected = task_six(3, 54, 1)
		actual = 54
		self.assertEqual(expected, actual)
		
	def test_simple_interest_is_equal(self):
		expected = task_seven(1000, 21.4, 5)
		actual = 1070.0
		self.assertEqual(expected, actual)

	def test_simple_interest_cannot_have_negative_arguments(self):
		self.assertRaises(ValueError, lambda: task_seven(1000, 24.3, -5))	

	def test_area_of_rectangle_of_length_10_and_width_5_is_50(self):
		expected = task_nine(10, 5)
		actual = 50
		self.assertEqual(expected, actual)

	def test_area_of_rectangle_of_length_10_and_width_negative_5_throws_error(self):
		self.assertRaises(ValueError, lambda: task_nine(-10, 5))

	def test_reverse_of_12345_is_54321(self):
		expected = task_ten(12345)
		actual = 54321
		self.assertEqual(expected, actual)

	def test_reverse_of_12321_is_12321(self):
		expected = task_ten(12321)
		actual = 12321
		self.assertEqual(expected, actual)
		
				
	
		