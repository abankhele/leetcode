/*
Q1. Print reverse string
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Write a recursive function that takes a string, S, as input and prints the characters of S in reverse order.



Problem Constraints

1 <= |s| <= 1000



Input Format

First line of input contains a string S.



Output Format

Print the character of the string S in reverse order.



Example Input

Input 1:

 scaleracademy
Input 2:

 cool


Example Output

Output 1:

 ymedacarelacs
Output 2:

 looc


Example Explanation

Explanation:

 Print the reverse of the string in a single line.
*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        reverseString1(s,s.length()-1);
        
    }

    private static void reverseString1(String Str, int end ){
        if(end<0){
            return;
        }
       
        System.out.print(Str.charAt(end));

        reverseString1(Str,end-1);
    }
}
/*
Q2. Sum of Digits!
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a number A, we need to find the sum of its digits using recursion.


Problem Constraints

1 <= A <= 109


Input Format

The first and only argument is an integer A.


Output Format

Return an integer denoting the sum of digits of the number A.


Example Input

Input 1:

 A = 46
Input 2:

 A = 11


Example Output

Output 1:

 10
Output 2:

 2


Example Explanation

Explanation 1:

 Sum of digits of 46 = 4 + 6 = 10
Explanation 2:

 Sum of digits of 11 = 1 + 1 = 2
*/
public class Solution {
    public int solve(int A) {

        if(A==0){
            return 0;
        }
        int digit = A%10;
       
        return digit+solve(A/10);
    }

}
