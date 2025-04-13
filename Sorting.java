/*
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.
Find the minimum cost to remove all elements from the array.
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {

        Collections.sort(A, Collections.reverseOrder());
        int sum=0;
        for(int i=0; i<A.size();i++){
            sum+=(A.get(i)*(i+1));

        }
        return sum;
    }
}

/*
Problem Description
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.


Problem Constraints
1 <= |A| <= 2*105
-108 <= A[i] <= 108


Input Format
First and only argument is an integer array A.


Output Format
Return 1 if any such integer p is present else, return -1.
*/
public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());

        int ans =0;
        int count=0;
        
        if(A.get(0) == 0){
            return 1;
        }
        for(int i=1; i<A.size();i++){
            if(A.get(i)!=A.get(i-1)){
                count=i;
            }
            if(count==A.get(i)){
               return 1;
            }
        }
        return -1;
    }
}
