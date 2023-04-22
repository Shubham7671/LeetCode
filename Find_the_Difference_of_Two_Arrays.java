


//
//2215. Find the Difference of Two Arrays
//        Easy
//        613
//        30
//        Companies
//        Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
//
//        answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
//        answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
//        Note that the integers in the lists may be returned in any order.
//
//
//
//        Example 1:
//
//        Input: nums1 = [1,2,3], nums2 = [2,4,6]
//        Output: [[1,3],[4,6]]
//        Explanation:
//        For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
//        For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
//        Example 2:
//
//        Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
//        Output: [[3],[]]
//        Explanation:
//        For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
//        Every integer in nums2 is present in nums1. Therefore, answer[1] = [].


import java.util.List;
import java.util.*;

public class Find_the_Difference_of_Two_Arrays {
    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>> li=new ArrayList<>();

            Set<Integer> l1=new HashSet<>();
            for(int i:nums1){
                l1.add(i);
            }

            Set<Integer> l2=new HashSet<>();
            for(int i:nums2){
                l2.add(i);
            }
            List<Integer> ans1 = new ArrayList<>();
            List<Integer> ans2 = new ArrayList<>();

            for(int i:l1) {
                if (l2.contains(i)) {
                    l2.remove(i);
                } else {
                    ans1.add(i);
                }
            }
            for(int i:l2) {
                ans2.add(i);
            }

            li.add(ans1);
            li.add(ans2);


            return li;
        }
    }
}
