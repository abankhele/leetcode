/*
Problem Description

You are given a function to_lower() which takes a character array A as an argument.




Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.

Return the lowercase version of the given character array.






Problem Constraints

1 <= |A| <= 105



Input Format

The only argument is a character array A.



Output Format

Return the lowercase version of the given character array.



Example Input

Input 1:

 A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
Input 2:

 A = ['S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0']


Example Output

Output 1:

 ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
Output 2:

 ['s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Explanation

Explanation 1:

 All the characters in the returned array are in lowercase alphabets.
Explanation 2:
 Since there is no lowercase version for '#', '2'and '0'.  It remains unchanged.
 Rest of the Uppercase alphabets are converted to lowercase accordingly.
*/
public class Solution {
    public char[] to_lower(char[] A) {
        for(int i=0; i< A.length; i++){
            if(A[i]>='A' && A[i]<='Z'){
                A[i]=(char)(A[i]+32);
            }
        }
        return A;

    }
}
/*
Problem Description

You are given a function to_upper() consisting of a character array A.

Convert each character of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.

Return the uppercase version of the given character array.




Problem Constraints

1 <= |A| <= 105



Input Format

Only argument is a character array A.



Output Format

Return the uppercase version of the given character array.



Example Input

Input 1:

 A = ['S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
Input 2:

 A = ['S', 'c', 'a', 'L', 'e', 'R', '#', '2', '0', '2', '0']








Example Output

Output 1:

 ['S', 'C', 'A', 'L', 'E', 'R', 'A', 'C', 'A', 'D', 'E', 'M', 'Y']
Output 2:

 ['S', 'C', 'A', 'L', 'E', 'R', '#', '2', '0', '2', '0']








Example Explanation

Explanation 1:
 All the characters in the returned array are in uppercase alphabets.
Explanation 2:
 Since there is no Uppercase version for '#', '2'and '0'.  It remains unchanged.
 Rest of the Lowercase alphabets are converted to Uppercase accordingly.


*/
public class Solution {
    public char[] to_upper(char[] A) {
        for(int i=0; i<A.length; i++){
            if(A[i]>='a' && A[i]<='z'){
                A[i]=(char)(A[i]-32);
            }
        }
        return A;
    }
}
/*
Problem Description

You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.



Problem Constraints

1 <= N <= 105

A[i] ∈ ['a'-'z', 'A'-'Z']



Input Format

First and only argument is a character string A.



Output Format

Return a character string.



Example Input

Input 1:

 A = "Hello" 
Input 2:

 A = "tHiSiSaStRiNg" 


Example Output

Output 1:

 hELLO 
Output 2:

 ThIsIsAsTrInG 


Example Explanation

Explanation 1:

 'H' changes to 'h'
 'e' changes to 'E'
 'l' changes to 'L'
 'l' changes to 'L'
 'o' changes to 'O'
Explanation 2:

 "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".

*/
public class Solution {
    public String solve(String A) {

        StringBuilder res = new StringBuilder();

        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)>='A' && A.charAt(i)<='Z'){
                res.append((char)(A.charAt(i)+32));
            }
            else{
               res.append((char)(A.charAt(i)-32));
            }
        }

        return res.toString();
    }
}

/*
Problem Description

Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.


Problem Constraints

1 <= |A| <= 105
1 <= A[i] <= 105


Input Format

The first argument is an integer array A.


Output Format

Return an integer array that is the sorted array A.


Example Input

Input 1:
A = [1, 3, 1]
Input 2:
A = [4, 2, 1, 3]


Example Output

Output 1:
[1, 1, 3]
Output 2:
[1, 2, 3, 4]


Example Explanation

For Input 1:
The array in sorted order is [1, 1, 3].
For Input 2:
The array in sorted order is [1, 2, 3, 4].

*/

public class Solution {
    public int[] solve(int[] A) {
        int largest=0;

        for(int i=0; i<A.length; i++){
            largest = Math.max(largest, A[i]);
        }
       
        int[] freq= new int[largest+1];
        for(int i=0; i<A.length;i++){
            freq[A[i]]++;
        }
        int j=0;
        for(int i=0; i<freq.length;i++){
            while(freq[i]>0 && j<A.length){
                A[j++]=i;
                freq[i]--;
            }
            
            
        }

        return A;
    }
}
/*
Problem Description

Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints

1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format

First and only argument is a string A.



Output Format

Return a string denoting the reversed string.



Example Input

Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output

Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation

Explanation 1:

 Reverse the given string.
*/

public class Solution {
    public String solve(String A) {
     StringBuilder res = new StringBuilder();
     for(int i=A.length()-1; i>=0; i--){
         res.append(A.charAt(i));
     }
     return res.toString();   
    }
}

/*
Problem Description

You are given a string A of size N.


Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.



Problem Constraints

1 <= N <= 3 * 105



Input Format

The only argument given is string A.



Output Format

Return the string A after reversing the string word by word.



Example Input

Input 1:
A = "the sky is blue"
Input 2:
A = "this is ib"


Example Output

Output 1:
"blue is sky the"
Output 2:
"ib is this"    


Example Explanation

Explanation 1:
We reverse the string word by word so the string becomes "blue is sky the".
Explanation 2:
We reverse the string word by word so the string becomes "ib is this".

*/
public class Solution {
    public String solve(String A) {
        StringBuilder ans = new StringBuilder();
        int end = A.length();
        for(int i=A.length()-1 ; i>=0;i--){
            if(A.charAt(i) == ' '){
                end=i;
            }
            else if(i==0 || A.charAt(i-1)==' '){
                if(ans.length()>0){
                    ans.append(' ');
                }
                ans.append(A.substring(i,end));
            }
            
        }
        return ans.toString();
    }
}
/*
Problem Description

Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints

1 <= N <= 6000



Input Format

First and only argument is a string A.



Output Format

Return a string denoting the longest palindromic substring of string A.



Example Input

Input 1:
A = "aaaabaaa"
Input 2:
A = "abba


Example Output

Output 1:
"aaabaaa"
Output 2:
"abba"


Example Explanation

Explanation 1:
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
Explanation 2:
We can see that longest palindromic substring is of length 4 and the string is "abba".
*/

public class Solution {
    public String longestPalindrome(String A) {
        if (A == null || A.length() < 1) return "";

        int start = 0;
        int maxLen = 0;

        for (int i = 0; i < A.length(); i++) {
            int len1 = expand(A, i, i);       // odd-length palindrome
            int len2 = expand(A, i, i + 1);   // even-length palindrome
            int len = Math.max(len1, len2);

            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;  // start index of the palindrome
            }
        }

        return A.substring(start, start + maxLen);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // actual palindrome length
    }
}

