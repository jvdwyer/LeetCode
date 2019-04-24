import unittest
import UniqueMorseCode

class Test_Main(unittest.TestCase):

    def test_unique_morse_representations(self):
        self.assertEquals(UniqueMorseCode.unique_morse_representations(["gin", "zen", "gig", "msg"]), 2)
    
if __name__ == '__main__':
    unittest.main()