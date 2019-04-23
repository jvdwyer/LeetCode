import unittest
import main

class Test_Main(unittest.TestCase):

    def test_uniqueMorseRepresentations(self):
        self.assertEquals(main.uniqueMorseRepresentations(["gin", "zen", "gig", "msg"]), 2)
    
if __name__ == '__main__':
    unittest.main()