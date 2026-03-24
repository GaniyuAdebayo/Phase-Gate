from unittest import TestCase
from mini_parking_system import *

class TestClass (TestCase):


	def test_it_parks_automatically(self):

		parking_lot = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		park_automatically(parking_lot)
		park_automatically(parking_lot)
		self.assertTrue(space_availability(parking_lot, 1))
		self.assertTrue(space_availability(parking_lot, 2))

	def test_it_parks_manually(self):

		parking_lot = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

		park_automatically(parking_lot)
		park_manually(parking_lot, 7)
		self.assertTrue(space_availability(parking_lot, 1))
		self.assertFalse(space_availability(parking_lot, 2))
		self.assertTrue(space_availability(parking_lot, 7))
		unpark_car(parking_lot, 1)
		self.assertFalse(space_availability(parking_lot, 1))

