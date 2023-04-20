import java.util.HashMap;

//1512. Number of Good Pairs
//        Easy
//        3.8K
//        185
//        Companies
//        Given an array of integers nums, return the number of good pairs.
//
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//        Example 2:
//
//        Input: nums = [1,1,1,1]
//        Output: 6
//        Explanation: Each pair in the array are good.
//        Example 3:
//
//        Input: nums = [1,2,3]
//        Output: 0





public class Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            int count=mp.getOrDefault(nums[i],0);
            res+=count;
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        return res;
    }
}
