//1748. Sum of Unique Elements
//Easy
//1.2K
//29
//Companies
//You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
//
//Return the sum of all the unique elements of nums.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,2]
//Output: 4
//Explanation: The unique elements are [1,3], and the sum is 4.
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: 0
//Explanation: There are no unique elements, and the sum is 0.
//Example 3:
//
//Input: nums = [1,2,3,4,5]
//Output: 15
//Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
import java.util.*;
public class Sum_of_Unique_Elements {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0;
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1) ;
        }
        for(Map.Entry<Integer, Integer> e : mp.entrySet()){

            if(e.getValue()==1){
                sum+=e.getKey();
            }

        }
        return sum;
    }
}
