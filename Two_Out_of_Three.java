//2032. Two Out of Three
//        Easy
//        591
//        34
//        Companies
//        Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
//
//
//        Example 1:
//
//        Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
//        Output: [3,2]
//        Explanation: The values that are present in at least two arrays are:
//        - 3, in all three arrays.
//        - 2, in nums1 and nums2.
//        Example 2:
//
//        Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
//        Output: [2,3,1]
//        Explanation: The values that are present in at least two arrays are:
//        - 2, in nums2 and nums3.
//        - 3, in nums1 and nums2.
//        - 1, in nums1 and nums3.
//        Example 3:
//
//        Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
//        Output: []
//        Explanation: No value is present in at least two arrays.
import java.util.*;
public class Two_Out_of_Three {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        /** Since we have 3 arrays of numbers,
         * we need 3 boolean arrays.
         *  Here is the length of the longest
         *  array that can reach the length of the array */
        boolean[] b1 = new boolean[101];
        boolean[] b2 = new boolean[101];
        boolean[] b3 = new boolean[101];

        /** where values of the boolean array
         * at the corresponding index are changed to true */
        for (int num : nums1) b1[num] = true;

        for (int num : nums2) b2[num] = true;

        for (int num : nums3) b3[num] = true;

        List<Integer> res = new ArrayList<>();


        for (int i = 1; i <= 100; i++){
            if((b1[i] || b2[i]) && (b2[i] || b3[i]) && (b3[i] || b1[i]))
                res.add(i);
        }
        return res;

    }
}
