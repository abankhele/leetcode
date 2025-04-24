/*
Problem Description

SCALER organizes a series of contests aimed at helping learners enhance their coding skills. Each learner can participate in multiple contests, and their participation is represented by integers in an array. The goal is to identify how frequently each learner has participated in these contests. This information will help SCALER determine which learners are participating the least, allowing them to provide targeted support and encouragement.


Given an array A that represents the participants of various contests, where each integer corresponds to a specific learner, and an array B containing the learners for whom you want to check participation frequency, your task is to find the frequency of each learner from array B in the array A and return a list containing all these frequencies


Problem Constraints

1 <= |A| <= 105
1 <= |B| <= 105
1 <= A[i] <= 105
1 <= B[i] <= 105


Input Format

First argument A is an array of integers.
Second argument B is an array of integers denoting the queries.


Output Format

Return an array of integers containing the frequency of each learner in B as found in array A.


Example Input

Input 1:
A = [1, 2, 1, 1]
B = [1, 2]
Input 2:
A = [2, 5, 9, 2, 8]
B = [3, 2]


Example Output

Output 1:
[3, 1]
Output 2:
[0, 2]


Example Explanation

For Input 1:

The frequency of learner 1 in the array A is 3 (they participated in three contests).
The frequency of learner 2 in the array A is 1 (they participated in one contest).

For Input 2:

The frequency of learner 3 in the array A is 0 (they did not participate in any contest).
The frequency of learner 2 in the array A is 2 (they participated in two contests).
 */

public class Solution {
    public int[] solve(int[] A, int[] B) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int i=0; i<A.length; i++){
        if(hm.containsKey(A[i])){
            hm.put(A[i], hm.get(A[i])+1);
        }else{
            hm.put(A[i], 1);
        }
    }

    for(int i=0; i<B.length; i++){
        if(hm.containsKey(B[i])){
            B[i]=hm.get(B[i]);
        }else{
            B[i]=0;
        }
    }

    return B;
    }
}
/*
Q2. First Repeating element
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer array A of size N, find the first repeating element in it.






We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.








Problem Constraints

1 <= N <= 105

1 <= A[i] <= 109



Input Format

The first and only argument is an integer array A of size N.



Output Format

Return an integer denoting the first repeating element.



Example Input

Input 1:

 A = [10, 5, 3, 4, 3, 5, 6]
Input 2:

 A = [6, 10, 5, 4, 9, 120]


Example Output

Output 1:

 5
Output 2:

 -1


Example Explanation

Explanation 1:

 5 is the first element that repeats
Explanation 2:

 There is no repeating element, output -1
*/
public class Solution {
    public int solve(int[] A) {

        HashMap<Integer, Integer> hm = new HashMap();
        for(int i=0 ; i<A.length ; i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i])+1);
            }
            else{
                hm.put(A[i], 1);
            }
        }

        for(int i=0 ; i<A.length ; i++){
            
            if(hm.get(A[i])>1){
                return A[i];
            }
        }

        return -1;

    }
}
/*
Q3. Sub-array with 0 sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.




Problem Constraints

1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9




Input Format

The only argument given is the integer array A.



Output Format

Return whether the given array contains a subarray with a sum equal to 0.



Example Input

Input 1:


 A = [1, 2, 3, 4, 5]


Input 2:

















 A = [4, -1, 1]











Example Output

Output 1:

 0
Output 2:

 1


Example Explanation

Explanation 1:

 No subarray has sum 0.
Explanation 2:

 The subarray [-1, 1] has sum 0.
*/

public class Solution {
  // Do not write code to include libraries, main() function or accept any input from the console.
  // Initialization code is already written and hidden from you. Do not write code for it again.
  public int solve(int[] A) {
      // Just write your code below to complete the function. Required input is available to you as the function arguments.
      // Do not print the result or any output. Just return the result via this function.
      long sum =A[0];
       if(sum==0  ){
              return 1;
          }
      HashSet<Long> hs = new HashSet<>();
      for(int i=1 ; i<A.length; i++){
          sum+=A[i];
            if(sum==0  ){
              return 1;
          }
          hs.add(sum);
         
      }
    if(hs.size() != A.length-1){
        return 1;
    }

      return 0;
     
  }
}
/*
Q5. Count distinct elements
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A of N integers, return the number of unique elements in the array.


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
3
Output 2:
4


Example Explanation

For Input 1:
The distinct elements of the array are 3, 4 and 6.
For Input 2:
The distinct elements of the array are 3, 9, 0 and 1.
*/

public class Solution {
    public int solve(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0 ; i<A.length ; i++){
            hs.add(A[i]);
        }

        return hs.size();
    }
}
