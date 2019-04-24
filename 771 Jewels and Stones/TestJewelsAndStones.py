import unittest
import JewelsAndStones

class TestMain(unittest.TestCase):

    def test_num_jewels_in_stones(self):
        j = "aA"
        s = "aAAbbbb"
        self.assertEqual(JewelsAndStones.num_jewels_in_stones(j, s), 3)

if __name__ == '__main__':
    unittest.main()