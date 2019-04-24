import unittest
import ToLowerCase

class TestMain(unittest.TestCase):

    def test_to_lower_case(self):
        self.assertEqual(ToLowerCase.to_lower_case("this SHOULD be LOWER case"), "this should be lower case")

    def test_to_lower_case_hard_way(self):
        self.assertEqual(ToLowerCase.to_lower_case_hard_way("this SHOULD be LOWER case"), "this should be lower case")

if __name__ == '__main__':
    unittest.main()