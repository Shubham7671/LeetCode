import java.util.HashSet;

//287. Find the Duplicate Number
//        Medium
//        18.9K
//        2.8K
//        Companies
//        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//        There is only one repeated number in nums, return this repeated number.
//
//        You must solve the problem without modifying the array nums and uses only constant extra space.
//
//
//
//        Example 1:
//
//        Input: nums = [1,3,4,2,2]
//        Output: 2
//        Example 2:
//
//        Input: nums = [3,1,3,4,2]
//        Output: 3
public class Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int i:nums){
            if(st.add(i)==false){
                return i;
            }
            // st.add(i);
        }
        return -1;


    }
}
