/*
Problem Description
Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will represent the colors as,
red -> 0
white -> 1
blue -> 2
Note: Using the library sort function is not allowed.


Problem Constraints
1 <= N <= 1000000
0 <= A[i] <= 2


Input Format
First and only argument of input contains an integer array A.


Output Format
Return an integer array in asked order


Example Input
Input 1 :
    A = [0, 1, 2, 0, 1, 2]
Input 2:
    A = [0]


Example Output
Output 1:
    [0, 0, 1, 1, 2, 2]
Output 2:
    [0]
*/

public class Solution {
    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0; i<A.size(); i++){
            if(A.get(i)==0){
                count0++;
            }
            if(A.get(i)==1){
                count1++;
            }
            if(A.get(i)==2){
                count2++;
            }
        }


        for(int i=0; i<A.size();i++){
            if(i<count0){
                A.set(i,0);
            }else if(i<count1+count0){
                 A.set(i,1);
            }else{
             A.set(i,2);
            }
        }

        return A;
    }
}


/*
Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.


Problem Constraints
2 <= N <= 105
-109 <= A[i] <= 109


Input Format
The first and only argument is an integer array A of size N.


Output Format
Return 1 if the array can be rearranged to form an arithmetic progression, otherwise return 0.


Example Input
Input 1:
 A = [3, 5, 1]
Input 2:
 A = [2, 4, 1]


Example Output
Output 1:
 1
Output 2:
 0
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int ans;
        int diff = A.get(1)-A.get(0);
        for(int i=1;i<A.size()-1;i++) {
            if(A.get(i+1)-A.get(i)!=diff){
                return 0;
            }
        }
        return 1;
    }
}

/*
Problem Description
Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit of every number.
If a number has no tens digit, we can assume value to be 0.
If 2 numbers have same tens digit, in that case number with max value will come first
Solution should be based on comparator.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109


Input Format
First argument A is an array of integers.


Output Format
Return the array after sorting


Example Input
Input 1:
A = [15, 11, 7, 19]
Input 2:
A = [2, 24, 22, 19]


Example Output
Output 1:
[7, 19, 15, 11]
Output 2:
[2, 19, 24, 22]


Example Explanation
For Input 1:
The sorted order is [7, 19, 15, 11]. The tens digit of 7 is 0, 
and that of 19, 15 and 11 is 1.
For Input 2:
The sorted order is [2, 19, 24, 22]. The tens digit of 2 is 0, 
that of 19 is 1 and that of 22 and 24 is 2.
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        Collections.sort(A, (a,b)->{

            int num1 = get10(a);
            int num2 = get10(b);

            if(num1!=num2){
                return num1-num2;
            }else{
                return b-a;
            }

           
        });
        return A;
    }

    private int get10(int num){
        int i=0;
        int digit=0;
        
        while(num>=0 && i<2){
            digit=num%10;
            num=num/10;
            i++;
        }

        return digit;
    }
}

