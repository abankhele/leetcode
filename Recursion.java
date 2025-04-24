/*
Q1. Find Fibonacci - II
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

The Fibonacci numbers are the numbers in the following integer sequence.



0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:

Fn = Fn-1 + Fn-2

Given a number A, find and return the Ath Fibonacci Number using recursion.

Given that F0 = 0 and F1 = 1.





Problem Constraints

0 <= A <= 20



Input Format

First and only argument is an integer A.



Output Format

Return an integer denoting the Ath term of the sequence.



Example Input

Input 1:

 A = 2
Input 2:

 A = 9
*/

public class Solution {
    public int findAthFibonacci(int A) {
        if(A==0 || A==1){
            return A;
        }
        return findAthFibonacci(A-1)+findAthFibonacci(A-2);
    }
}

/*
Q2. Find Factorial!
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Write a program to find the factorial of the given number A using recursion.

Note: The factorial of a number N is defined as the product of the numbers from 1 to N.


Problem Constraints

0 <= A <= 12



Input Format

First and only argument is an integer A.



Output Format

Return an integer denoting the factorial of the number A.



Example Input

Input 1:

 A = 4
Input 2:

 A = 1


Example Output

Output 1:

 24
Output 2:

 1


Example Explanation

Explanation 1:

 Factorial of 4 = 4 * 3 * 2 * 1 = 24
Explanation 2:

 Factorial of 1 = 1
*/
public class Solution {
    public int solve(int A) {
        if(A==0){
            return 1;
        }
        return A*solve(A-1);
    }
}
/*

Q3. Check Palindrome using Recursion
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward and backward.






Problem Constraints

1 <= |A| <= 50000




String A consists only of lowercase letters.






Input Format

The first and only argument is a string A.



Output Format

Return 1 if the string A is a palindrome, else return 0.



Example Input

Input 1:

 A = "naman"
Input 2:

 A = "strings"


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

 "naman" is a palindomic string, so return 1.
Explanation 2:

 "strings" is not a palindrome, so return 0.
*/

public class Solution {
    int helper(String A, int start, int end){
        if(start>=end){
            return 1;
        }
        if(A.charAt(start)!=A.charAt(end)){
            return 0;
        }
        return helper(A, start+1, end-1);
    }
    public int solve(String A) {
        int n = A.length()-1;
        return helper(A,0,n);
    }
}
/*
Q4. Print 1 to A function
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given an integer A, print 1 to A using using recursion.

Note :- After printing all the numbers from 1 to A, print a new line.



Problem Constraints

1 <= A <= 104



Input Format

First argument A is an integer.



Output Format

Print A space-separated integers 1 to A.
Note: There should be exactly one space after each integer. After printing all the integers, print a new line



Example Input

Input 1:

A = 10
Input 2:

A = 5


Example Output

Output 1:

1 2 3 4 5 6 7 8 9 10 
Output 2:

1 2 3 4 5 


Example Explanation

Explanation 1:

Print 1 to 10 space separated integers.
Explanation 2:

Print 1 to 5 space separated integers.
*/
public class Solution {
    public void print1toA(int A){
        if(A == 0){
            return;
        }
        print1toA(A - 1);
        System.out.print(A + " ");
    }
    public void solve(int A) {
        print1toA(A);
        System.out.print("\n");
    }
}
/*
Q5. Print A to 1 function
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given an integer A, print A to 1 using using recursion.

Note :- After printing all the numbers from A to 1, print a new line.



Problem Constraints

1 <= A <= 104



Input Format

First argument A is an integer.



Output Format

Print A space-separated integers A to 1.
Note: There should be exactly one space after each integer. Print a new line after printing the A integers



Example Input

Input 1:

10
Input 2:

5


Example Output

Output 1:

10 9 8 7 6 5 4 3 2 1 
Output 2:

5 4 3 2 1 


Example Explanation

Explanation 1:

Print 10 to 1 space separated integers.
Explanation 2:

Print 5 to 1 space separated integers.
*/
public class Solution {
    public void solve(int A) {
        if(A==0){
            return;
        }
        System.out.println(A+" ");
        solve(A-1);
    }
}
