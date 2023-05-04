//128. Longest Consecutive Sequence
//Medium
//15.8K
//660
//Companies
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//
//You must write an algorithm that runs in O(n) time.
//
//
//
//Example 1:
//
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//Example 2:
//
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
import java.util.*;
public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer>mp=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
            mp.add(i);

        }
        int maxCount=-1;
        for(int i=0;i<nums.length;i++){
            if(!mp.contains(nums[i]-1)){
                int cur=nums[i];
                int count=1;

                while(mp.contains(cur+1)){
                    count++;
                    cur++;
                }
                maxCount=Math.max(maxCount,count);
            }

        }

        return maxCount;


    }
}
