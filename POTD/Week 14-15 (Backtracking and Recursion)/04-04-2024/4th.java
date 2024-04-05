/**
 * Link - https://www.geeksforgeeks.org/problems/palindrome0746/1
 * Palindrome
SchoolAccuracy: 56.28%Submissions: 74K+Points: 0
Given an integer, check whether it is a palindrome or not.

Note : Strings which read the same backwards as forwards , eg - MADAM, MOM etc.

Example 1:

Input: n = 555
Output: Yes

Example 2:

Input: n = 123
Output: No
 

Your Task:
You don't need to read or print anything. Your task is to complete the function is_palindrome() which takes the number as input parameter and returns "Yes" if it is palindrome otherwise returns "No"(Without quotes).
 

Expected Time Complexity: O(x)
Expected Space Complexity: O(x) where x is number of digits in n.
 

Constraints:
1 <= n <= 1000
 */

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        String s = Integer.toString(n);
        return (isPalindrome(s,0,s.length()-1)==true)?"Yes":"No";
    }
    
    boolean isPalindrome(String s, int i, int j){
        if(i>=j)
            return true;
        if(s.charAt(i)!=s.charAt(j))
            return false;
        return isPalindrome(s,++i,--j);
    }
}