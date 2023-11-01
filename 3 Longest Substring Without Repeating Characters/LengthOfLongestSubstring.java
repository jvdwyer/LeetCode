// Source: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Author: John Dwyer
// Date: 11/1/2023
/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/

import java.util.Set;
import java.util.HashSet;

class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int result = 0, windowStart = 0;
        Set<Character> set = new HashSet<>();

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
            while (set.contains(rightChar)) {
                char leftChar = s.charAt(windowStart);
                set.remove(leftChar);
                windowStart++;
            }

            set.add(rightChar);
            result = Math.max(result, windowEnd - windowStart + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        // Test1: the input string is an empty string
        int result1 = lengthOfLongestSubstring("");
        System.out.println("Test 1: Expected: 0, Actual: " + result1);
        
        // Test2: the input string has no repeating characters
        int result2 = lengthOfLongestSubstring("abcde");
        System.out.println("Test 2: Expected: 5, Actual: " + result2);

        // Test3: the input string has some repeating characters
        int result3 = lengthOfLongestSubstring("abcabcbb");
        System.out.println("Test 3: Expected: 3, Actual: " + result3);

        // Test4: the input string has adjacent repeating characters
        int result4 = lengthOfLongestSubstring("pwwkew");
        System.out.println("Test 4: Expected: 3, Actual: " + result4);
    }
}