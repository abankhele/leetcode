/*
Q1. Count Subarray Zero Sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7


Problem Constraints

1 <= N <= 105
-109 <= A[i] <= 109


Input Format

Single argument which is an integer array A.


Output Format

Return an integer.


Example Input

Input 1:

 A = [1, -1, -2, 2]
Input 2:

 A = [-1, 2, -1]


Example Output

Output 1:

3
Output 2:

1


Example Explanation

Explanation 1:

 The subarrays with zero sum are [1, -1], [-2, 2] and [1, -1, -2, 2].
Explanation 2:

 The subarray with zero sum is [-1, 2, -1].


*/

public class Solution {
    public int solve(int[] A) {

        long[] pf = new long[A.length];
        pf[0]=A[0];
        for(int i =1; i<A.length; i++){
            pf[i]=A[i]+pf[i-1];
        }
        int ans =0;
        HashMap<Long, Long> hm = new HashMap<>();
        for(int i =0 ; i<pf.length ;i++){
            if(pf[i]==0){
                ans++;
            }
            if(hm.containsKey(pf[i])){
                hm.put(pf[i], hm.get(pf[i])+1);
            }else{
                hm.put(pf[i],(long)1);
            }
        }
        
        for(long x: hm.keySet()){
                long freq = hm.get(x);
    if (freq >= 2) {
        ans += (freq * (freq - 1)) / 2;
    
            }

        }
        return (ans%((int)Math.pow(10,9)+7));
    }
}
/*
Q2. Common Elements
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.


NOTE:


Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.


Problem Constraints

1 <= N, M <= 105

1 <= A[i] <= 109



Input Format

First argument is an integer array A of size N.

Second argument is an integer array B of size M.



Output Format

Return an integer array denoting the common elements.



Example Input

Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output

Output 1:

 [1, 2, 2]
Output 2:

 [2, 10]


Example Explanation

Explanation 1:

 Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
Explantion 2:

 Elements (2, 10) appears in both the array.
*/
public class Solution {
  // Do not write code to include libraries, main() function or accept any input from the console.
  // Initialization code is already written and hidden from you. Do not write code for it again.
  public int[] solve(int[] A, int[] B) {
      // Just write your code below to complete the function. Required input is available to you as the function arguments.
      // Do not print the result or any output. Just return the result via this function.

      HashMap<Integer, Integer> hm = new HashMap<>();
      int min = Math.min(A.length, B.length);
      for(int i=0 ; i<A.length; i++){
          if(hm.containsKey(A[i])){
              hm.put(A[i], hm.get(A[i])+1);
          }else{
              hm.put(A[i], 1);
          }
      }
      ArrayList<Integer> arr = new ArrayList<>();
      int j=0;
      for(int i=0; i<B.length; i++){
          if(hm.containsKey(B[i]) && (hm.get(B[i]) !=0)){
              
              arr.add(B[i]);
              hm.put(B[i], hm.get(B[i])-1);
          }
      }
      int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
      return result;
  }
}
/*
Q3. Colorful Number
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a number A, find if it is COLORFUL number or not.

If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:

A number can be broken into different consecutive sequence of digits. 
The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245. 
This number is a COLORFUL number, since the product of every consecutive sequence of digits is different



Problem Constraints

1 <= A <= 2 * 109



Input Format

The first and only argument is an integer A.



Output Format

Return 1 if integer A is COLORFUL else return 0.



Example Input

Input 1:

 A = 23
Input 2:

 A = 236


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

 Possible Sub-sequences: [2, 3, 23] where
 2 -> 2 
 3 -> 3
 23 -> 6  (product of digits)
 This number is a COLORFUL number since product of every digit of a sub-sequence are different. 
Explanation 2:

 Possible Sub-sequences: [2, 3, 6, 23, 36, 236] where
 2 -> 2 
 3 -> 3
 6 -> 6
 23 -> 6  (product of digits)
 36 -> 18  (product of digits)
 236 -> 36  (product of digits)
 This number is not a COLORFUL number since the product sequence 23  and sequence 6 is same. 
*/

public class Solution {
    public int colorful(int A) {
         ArrayList<Integer> arr = new ArrayList<>();
        while(A>0){
            int digit = A%10;
            arr.add(digit);
            A=A/10;
        }
      Collections.reverse(arr); 
       
      
        HashSet<Long> hs = new HashSet<>();
        for(int i=0 ; i<arr.size(); i++){
            
            long product = arr.get(i);
            
            hs.add(product);
            for(int j=i+1; j<arr.size();j++){
                product = product * arr.get(j);
                
                hs.add(product);
            }
        }
        if(hs.size()==((arr.size()*(arr.size()+1) )/ 2)){
            return 1;
        }
        return 0;

     
    }
}
/*
Q4. Count unique elements
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.


Problem Constraints

1 <= N <= 105
1 <= A[i] <= 109


Input Format

First argument A is an array of integers.


Output Format

Return an integer.


Example Input

Input 1:
A = [3, 4, 3, 6, 6]
Input 2:
A = [3, 3, 3, 9, 0, 1, 0]


Example Output

Output 1:
1
Output 2:
2


Example Explanation

Explanation 1:
Only the element 4 has a frequency 1.
Explanation 2:
The elements 9 and 1 has a frequncy 1.
*/
public class Solution {
    public int solve(int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0 ; i<A.length; i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i])+1);
            }else{
                hm.put(A[i], 1);
            }
        } 
        int count =0;
        for(int x: hm.keySet()){
            if(hm.get(x)==1){
                count++;
            }
        }
        return count;
    }
}
