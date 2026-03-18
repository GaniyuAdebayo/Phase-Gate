from unittest import TestCase
from day_three_task import task_one

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