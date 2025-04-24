/*
Q1. Count Pair Sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.

Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.


Problem Constraints

1 <= N <= 105
1 <= A[i] <= 109
1 <= B <= 109


Input Format

First argument A is an array of integers and second argument B is an integer.


Output Format

Return an integer.


Example Input

Input 1:

A = [3, 5, 1, 2]
B = 8
Input 2:

A = [1, 2, 1, 2]
B = 3


Example Output

Output 1:

1
Output 2:

4


Example Explanation

Example 1:

The only pair is (1, 2) which gives sum 8
Example 2:

The pair which gives sum as 3 are (1, 2), (1, 4), (2, 3) and (3, 4). 
*/
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        HashMap<Long, Long> map = new HashMap<>();
        for(int i=0 ; i<A.size(); i++){
            long num = (long)A.get(i);
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,(long)1);
            }
        }
        int count =0;
        for(long x : map.keySet()){
            long a = x;
            long b = B-a;
            if(map.containsKey(b)){
                if(a<b){
                    count+= map.get(a)*map.get(b);
                }
                if(a==b){
                    long f = map.get(a);
                    count+= (f*(f-1))/2;
                }
            }
        }
        return count%((int) Math.pow(10,9)+7);
    }

}
/*
Q2. Count Pair Difference
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given an array A of N integers and an integer B.
Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.


Problem Constraints

1 <= N <= 105
1 <= A[i] <= 109
1 <= B <= 109


Input Format

First argument A is an array of integers and second argument B is an integer.


Output Format

Return an integer.


Example Input

Input 1:

A = [3, 5, 1, 2]
B = 4
Input 2:

A = [1, 2, 1, 2]
B = 1


Example Output

Output 1:

1
Output 2:

4


Example Explanation

Example 1:

The only pair is (2, 3) which gives difference as 4
Example 2:

The pair which gives difference as 3 are (2, 1), (4, 1), (2, 3) and (4, 3). 
*/
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
    
    HashMap<Integer, Integer > map = new HashMap<>();
    for(int i =0 ; i<A.size(); i++){
        int num =  A.get(i);
      if(map.containsKey(num)){
          map.put(num , map.get(num)+1);
      }  else{
          map.put(num, 1);
      }
    }
    int count =0;
    for(int x: map.keySet()){
     
       
            if(map.containsKey(B+x)){
            count+= map.get(x)*map.get(B+x);
            }
            if(B==0){
                int f = map.get(x);
                count+=(f*(f-1))/2;
            }
        
    }
    return count%((int)Math.pow(10,9)+7);
    
    }


}
/*Q3. Pair With Given Difference
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.

Return 1 if any such pair exists else return 0.



Problem Constraints

1 <= N <= 105
-103 <= A[i] <= 103
-105 <= B <= 105


Input Format

First argument is an integer array A of size N.

Second argument is an integer B.



Output Format

Return 1 if any such pair exists else return 0.



Example Input

Input 1:

 A = [5, 10, 3, 2, 50, 80]
 B = 78
Input 2:

 A = [-10, 20]
 B = 30
Input 2=3:

 A = [-100, 20, 80]
 B = 9


Example Output

Output 1:

 1
Output 2:

 1
Output 3:

 0


Example Explanation

Explanation 1:

 Pair (80, 2) gives a difference of 78.
Explanation 2:

 Pair (20, -10) gives a difference of 30 i.e 20 - (-10) => 20 + 10 => 30
Explanation 3:

 There is no such pairs, that has a difference of 9.

*/
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<A.size(); i++){
                if(set.contains(B+A.get(i))||set.contains(A.get(i) -B)){
                    return 1;
                }
                set.add(A.get(i));   
        }


        return 0;
        
    }
}
/*
Q4. Subarray with given sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.






If the answer does not exist return an array with a single integer "-1".

First sub-array means the sub-array for which starting index in minimum.








Problem Constraints

1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format

The first argument given is the integer array A.

The second argument given is integer B.



Output Format

Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single integer "-1".



Example Input

Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output

Output 1:





 [2, 3]
Output 2:

 [-1]






Example Explanation

Explanation 1:

 [2, 3] sums up to 5.
Explanation 2:

 No subarray sums up to required number.
*/
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int i=0;
        int j=0;
        int start=-1;
        int end=-1;
        int sum = A.get(i);
        while(j<=A.size()-1){
            if(sum<B){
                j++;
            if (j < A.size()) {
                    sum += A.get(j);
                }
            }
            else if(sum>B){
                sum -= A.get(i);
                i++;
            }else{
                start=i;
                end=j;
                break;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        if(start == -1){
            res.add(-1);
            return res;
        }
        for(int k = start; k<=end; k++){
            res.add(A.get(k));
        }
        return res;
    }
}
/*
Q5. Subarray Sum Equals K
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A and an integer B.
Find the total number of subarrays having sum equals to B.


Problem Constraints

 1 <= length of the array <= 50000
-1000 <= A[i] <= 1000


Input Format

The first argument given is the integer array A.
The second argument given is integer B.


Output Format

Return the total number of subarrays having sum equals to B.


Example Input

Input 1:
A = [1, 0, 1]
B = 1
Input 2:
A = [0, 0, 0]
B = 0


Example Output

Output 1:
4
Output 2:
6


Example Explanation

Explanation 1:
[1], [1, 0], [0, 1] and [1] are four subarrays having sum 1.
Explanation 1:
All the possible subarrays having sum 0.

*/
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0, 1); 
        for(int i=0;i<A.size();i++){
            sum +=A.get(i);
            if(map.containsKey(sum-B)){
                count+=map.get(sum-B);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }else{
            map.put(sum, 1);
            }
        }

        return count;
    }
}
/*

Q8. Pairs With Given Xor
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer array A containing N distinct integers.




Find the number of unique pairs of integers in the array whose XOR is equal to B.

NOTE:

Pair (a, b) and (b, a) is considered to be the same and should be counted once.





Problem Constraints

1 <= N <= 105

1 <= A[i], B <= 107



Input Format

The first argument is an integer array A.







The second argument is an integer B.









Output Format

Return a single integer denoting the number of unique pairs of integers in the array A whose XOR is equal to B.



Example Input

Input 1:

 A = [5, 4, 10, 15, 7, 6]
 B = 5
Input 2:

 A = [3, 6, 8, 10, 15, 50]
 B = 5


Example Output

Output 1:

 1
Output 2:

 2


Example Explanation

Explanation 1:

 (10 ^ 15) = 5
Explanation 2:

 (3 ^ 6) = 5 and (10 ^ 15) = 5 
*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i), map.get(A.get(i))+1);
            }
            else{
                map.put(A.get(i), 1);
            }
        }
        int count=0;
        for(int x: map.keySet()){
            int a = x;
            int b = B^a;
            if(map.containsKey(b)){
                if(a<b){
                count+=map.get(a)*map.get(b);
                }if(B==0){
                    int f = map.get(x);
                    count+= (f*(f-1))/2;
                }
            }
        }
        return count;
    }
}



