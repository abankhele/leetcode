/*
Q1. Longest Subarray Zero Sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A of N integers.
Find the length of the longest subarray in the array which sums to zero.

If there is no subarray which sums to zero then return 0.



Problem Constraints

1 <= N <= 105
-109 <= A[i] <= 109


Input Format

Single argument which is an integer array A.


Output Format

Return an integer.


Example Input

Input 1:

 A = [1, -2, 1, 2]
Input 2:

 A = [3, 2, -1]


Example Output

Output 1:

3
Output 2:

0


Example Explanation

Explanation 1:

 [1, -2, 1] is the largest subarray which sums up to 0.
Explanation 2:

 No subarray sums up to 0.
*/
public class Solution {
    public int solve(ArrayList<Integer> A) {
        long prefixSum =0;
        int maxlen = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        //needed help
        for(int i =0 ; i<A.size() ; i++){
            prefixSum+=A.get(i);
            if(prefixSum ==0){
                maxlen=i+1;
            }
            if(map.containsKey(prefixSum)){
                int prev = map.get(prefixSum);
                maxlen = Math.max(maxlen, i-prev);
            }else{
                map.put(prefixSum, i);
            }
        }

        return maxlen;
    }
}
/*Q2. Check Pair Sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.


Problem Constraints

1 <= Length of array B <= 105
0 <= Bi <= 109
0 <= A <= 109


Input Format

First argument A is the Target sum, and second argument is the array B


Output Format

Return an integer value 1 if there exists such pair, else return 0.


Example Input

Input 1:








A = 8   
B = [3, 5, 1, 2, 1, 2]
Input 2:

A = 21   
B = [9, 10, 7, 10, 9, 1, 5, 1, 5]









Example Output

Output 1:








1
Output 2:

0









Example Explanation

Example 1:
It is possible to obtain sum 8 using 3 and 5.
Example 2:
There is no such pair exists.
*/

public class Solution {
    public int solve(int A, ArrayList<Integer> B) {
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0 ; i<B.size(); i++){
            int a = B.get(i);
            int b = A-a;
            if(hs.contains(b)){
                return 1;
            }
            hs.add(B.get(i));
        }

        return 0;
    }
}
/*
Q3. Distinct Numbers in Window
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.



Problem Constraints

1 <= N <= 106

1 <= A[i] <= 109


Input Format

First argument is an integer array A
Second argument is an integer B.



Output Format

Return an integer array.



Example Input

Input 1:

 A = [1, 2, 1, 3, 4, 3]
 B = 3
Input 2:

 A = [1, 1, 2, 2]
 B = 1


Example Output

Output 1:

 [2, 3, 3, 2]
Output 2:

 [1, 1, 1, 1]


Example Explanation

Explanation 1:

 A=[1, 2, 1, 3, 4, 3] and B = 3
 All windows of size B are
 [1, 2, 1]
 [2, 1, 3]
 [1, 3, 4]
 [3, 4, 3]
 So, we return an array [2, 3, 3, 2].
Explanation 2:

 Window size is 1, so the output array is [1, 1, 1, 1].
*/

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
       
        
        HashMap<Integer, Integer> map = new HashMap<>();
        //for first B elements
        for(int i=0 ;i<B; i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i), map.get(A.get(i))+1);
            }else{
                map.put(A.get(i), 1);
            }
         
        }
        ans.add(map.size());
       
        //for B to n elements
        for(int i=B; i<A.size(); i++ ){
            //for outgoing element
            int out = A.get(i-B);
            if(map.containsKey(out)){
                map.put(out, map.get(out)-1);
            }
            if(map.get(out)==0){
                map.remove(out);
            }
            //for incoming element
            int in = A.get(i);
            if(map.containsKey(in)){
                map.put(in, map.get(in)+1);
            }else{
                map.put(in, 1);
            }

            ans.add(map.size());
        }

        return ans;
    }
}
