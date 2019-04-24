import unittest
import NumUniqueEmails

class Test_Main(unittest.TestCase):

    def test_num_unique_emails(self):
        email_list = ["test.email+alex@leetcode.com", "test.email+ale.x@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com", "testemail+david@lee.tc+ode.com"]
        self.assertEqual(NumUniqueEmails.num_unique_emails(email_list), 3)

if __name__ == '__main__':
    unittest.main()
