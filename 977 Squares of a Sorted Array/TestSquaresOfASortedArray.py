import unittest
import SquaresOfASortedArray

class Test_Main(unittest.TestCase):

    def test_sorted_squares(self):
        input_list = [-7,-3,-2,2,3,11]
        self.assertEqual(SquaresOfASortedArray.sorted_quares(input_list), [4, 4, 9, 9, 49, 121])


if __name__ == '__main__':
    unittest.main()