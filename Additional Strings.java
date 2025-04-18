/*
Q1. Longest Common Prefix
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.


The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".




Problem Constraints

0 <= sum of length of all strings <= 1000000



Input Format

The only argument given is an array of strings A.



Output Format

Return the longest common prefix of all strings in A.



Example Input

Input 1:


A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:

A = ["abab", "ab", "abcd"];






Example Output

Output 1:

"a"
Output 2:

"ab"


Example Explanation

Explanation 1:

Longest common prefix of all the strings is "a".
Explanation 2:

Longest common prefix of all the strings is "ab".
*/

public class Solution {
    public String longestCommonPrefix(String[] A) {
        int mini = Integer.MAX_VALUE;
        StringBuilder str = new StringBuilder();

        for(String str1: A){
            mini = Math.min(mini, str1.length());
        }
        if(A.length ==1){
            return A[0];
        }
        for(int i=0 ; i<mini; i++){
            char prev = A[0].charAt(i);
            int count =0;
            for(int j=0 ; j<A.length;j++){
                if(A[j].charAt(i)==prev)
                {
                    count++;
                }else{
                    return str.toString();
                }
            }
            if(count == A.length){
                str.append(prev);
            }
        }
        return str.toString();

        
    }
}
/*
Q2. Isalnum()
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given a function isalpha() consisting of a character array A.





Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.





Problem Constraints

1 <= |A| <= 105



Input Format

Only argument is a character array A.



Output Format

Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.



Example Input

Input 1:

 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
Input 2:

 A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Output

Output 1:

 1
Output 2:

 0
*/
public class Solution {
    public int solve(char[] A) {
        int count =0;

      for(int i=0; i<A.length; i++){
          if((A[i]>='a' && A[i]<='z') || (A[i]>='A' &&A[i]<='Z') || (A[i]>='0' &&A[i]<='9')){
              count++;
          }
      }
      if(count!=A.length){
          return 0;
      }
      else {
          return 1;
      }
    }
}
/*
Q3. String operations
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.



Problem Constraints

1<=N<=100000


Input Format

First argument is a string A of size N.



Output Format

Return the resultant string.



Example Input

Input 1:
A="aeiOUz"
Input 2:
A="AbcaZeoB"


Example Output

Output 1:
"###z###z"
Output 2:
"bc###bc###"


Example Explanation

Explanatino 1:
First concatenate the string with itself so string A becomes "aeiOUzaeiOUz".
Delete all the uppercase letters so string A becomes "aeizaeiz".
Now replace vowel with '#', A becomes "###z###z".
Explanatino 2:
First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
Delete all the uppercase letters so string A becomes "bcaeobcaeo".
Now replace vowel with '#', A becomes "bc###bc###".
*/

public class Solution {
    public String solve(String A) {
        StringBuilder str= new StringBuilder();
        for(int i=0 ; i< A.length();i++){
            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u' ){
                str.append('#');
            }
            else if(A.charAt(i)>='a' && A.charAt(i)<='z' ){
                str.append(A.charAt(i));
            }
        }

        str.append(str);
        return str.toString();
    }
}
/*
Q4. Change character
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given a string A of size N consisting of lowercase alphabets.








You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

Find the minimum number of distinct characters in the resulting string.










Problem Constraints

1 <= N <= 100000

0 <= B <= N



Input Format

The first argument is a string A.



The second argument is an integer B.





Output Format

Return an integer denoting the minimum number of distinct characters in the string.



Example Input

A = "abcabbccd"
B = 3



Example Output

2



Example Explanation

We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
So the minimum number of distinct character will be 2.
*/
public class Solution {
    public int solve(String A, int B) {
        if(A.length() == 1){
            return 1;
        }
        int[] freq = new int[26];
        for(int i=0; i<A.length(); i++){
            int index = A.charAt(i)-'a';
            freq[index]++;
        }
        int count=0;

        Arrays.sort(freq);
        for(int i=0; i<26; i++){
            while(B>0 && freq[i]>0){
                freq[i]--;
                B--;
            }
            if(freq[i]!=0){
               count++;
            }
        }
        return count;
    }
}
/*
Q5. Count Occurrences
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Find the number of occurrences of bob in string A consisting of lowercase English alphabets.



Problem Constraints

1 <= |A| <= 1000


Input Format

The first and only argument contains the string A, consisting of lowercase English alphabets.


Output Format

Return an integer containing the answer.


Example Input

Input 1:

  "abobc"
Input 2:

  "bobob"


Example Output

Output 1:

  1
Output 2:

  2


Example Explanation

Explanation 1:

  The only occurrence is at second position.
Explanation 2:

  Bob occures at first and third position.
*/
public class Solution {
    public int solve(String A) {
        if(A.length()<3){
            return 0;
        }
        int count=0;
        for(int i=0; i<A.length()-2; i++){
            if(A.charAt(i)=='b' && A.charAt(i+1)=='o' && A.charAt(i+2)== 'b'){
                count++;
            }
        }
        return count;
    }
}
/*
Q6. Check anagrams
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.

Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.


Problem Constraints

1 <= N <= 105
A and B are lowercase strings


Input Format

Both arguments A and B are a string.


Output Format

Return 1 if they are anagrams and 0 if not


Example Input

Input 1:
A = "cat"
B = "bat"
Input 2:
A = "secure"
B = "rescue"


Example Output

Output 1:
0
Output 2:
1

*/
public class Solution {
    public int solve(String A, String B) {
        int[] freqA= new int[26];
        int[] freqB = new int[26];
        for(int i=0 ;i<A.length();i++){
            int idx1=A.charAt(i)-'a';
            freqA[idx1]++;
            int idx2=B.charAt(i)-'a';
            freqB[idx2]++;

        }

        for(int i=0; i<freqA.length ;i++){
            if(freqA[i]!=freqB[i]){
                return 0;
            }
        }

        return 1;
    }
}
/*
Q7. Add Binary Strings
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given two binary strings A and B. Return their sum (also a binary string).


Problem Constraints

1 <= length of A <= 105

1 <= length of B <= 105

A and B are binary strings



Input Format

The two argument A and B are binary strings.



Output Format

Return a binary string denoting the sum of A and B



Example Input

Input 1:
A = "100"
B = "11"
Input 2:
A = "110"
B = "10"


Example Output

Output 1:
"111"
Output 2:
"1000"


Example Explanation

For Input 1:
The sum of 100 and 11 is 111.
For Input 2:
 
The sum of 110 and 10 is 1000.


*/
public class Solution {
    public String addBinary(String A, String B) {
        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry = 0;
 StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += A.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += B.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}
