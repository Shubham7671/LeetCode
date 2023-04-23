import  java.util.*;

//2341. Maximum Number of Pairs in Array
//        Easy
//        517
//        13
//        Companies
//        You are given a 0-indexed integer array nums. In one operation, you may do the following:
//
//        Choose two integers in nums that are equal.
//        Remove both integers from nums, forming a pair.
//        The operation is done on nums as many times as possible.
//
//        Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed and answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.
//
//
//
//        Example 1:
//
//        Input: nums = [1,3,2,1,3,2,2]
//        Output: [3,1]
//        Explanation:
//        Form a pair with nums[0] and nums[3] and remove them from nums. Now, nums = [3,2,3,2,2].
//        Form a pair with nums[0] and nums[2] and remove them from nums. Now, nums = [2,2,2].
//        Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [2].
//        No more pairs can be formed. A total of 3 pairs have been formed, and there is 1 number leftover in nums.
//        Example 2:
//
//        Input: nums = [1,1]
//        Output: [1,0]
//        Explanation: Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [].
//        No more pairs can be formed. A total of 1 pair has been formed, and there are 0 numbers leftover in nums.
//        Example 3:
//
//        Input: nums = [0]
//        Output: [0,1]
//        Explanation: No pairs can be formed, and there is 1 number leftover in nums.
public class Maximum_Number_of_Pairs_in_Array {

    public int[] numberOfPairs(int[] nums) {

        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int left=0;
        int pair=0;
        for(Map.Entry<Integer, Integer> e : mp.entrySet()) {

            int a=e.getValue();
            if(a==1){
                left++;
            }else if(a%2==0){

                pair+=a/2;
            }else{
                pair+=Math.ceil(a/2);
                left++;
            }

        }
        int arr[]=new int[2];
        arr[0]=pair;
        arr[1]=left;
        return arr;

    }
}
