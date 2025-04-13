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
/*
Problem Description
You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of each element, i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.

Note: You cannot use any extra space


Problem Constraints
1 <= N <= 104
1 <= A[i] <= 104


Input Format
First argument A is an array of integers.


Output Format
Return an array of integers.
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        Collections.sort(A, (a, b)->{
            int a1 = countFactor(a);
            int b1 = countFactor(b);
            if(a1!=b1){
                return a1-b1;
            }else{
            return a-b;
            }
        });

         
         return A;
    }

    private int countFactor(int num){
    int count=0;
    for(int i=1; i*i<=num; i++){
        if(num%i==0){
            count++;

        if(i!=num/i){
            count++;
        }
        }

    }
    return count;
}

}

/*
Given an array A of non-negative integers, arrange them such that they form the largest number.
Note: The result may be very large, so you need to return a string instead of an integer.
Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109


Input Format
The first argument is an array of integers.


Output Format
Return a string representing the largest number.

*/

public class Solution {
    public String largestNumber(ArrayList<Integer> A) {
        Collections.sort(A, (a,b)->{
            String num1=""+a+b;
            String num2=""+b+a;
            return num2.compareTo(num1);
        });
        StringBuilder sb = new StringBuilder();
        int count=0;
        for (int i = 0; i < A.size(); i++) {
            sb.append(A.get(i));

            if(A.get(i)==0){
                count++;
            }
        }
        if(A.size()==count){

            return "0";
        }

        return sb.toString();
    }
    
}
