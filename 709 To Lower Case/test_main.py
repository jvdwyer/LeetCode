import unittest
import main

class TestMain(unittest.TestCase):

    def test_main(self):
        self.assertEqual(main.toLowerCase("this SHOULD be LOWER case"), "this should be lower case")

if __name__ == '__main__':
    unittest.main()