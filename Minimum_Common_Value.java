
//2540. Minimum Common Value
//Easy
//338
//4
//Companies
//Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
//
//Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
//
//
//
//Example 1:
//
//Input: nums1 = [1,2,3], nums2 = [2,4]
//Output: 2
//Explanation: The smallest element common to both arrays is 2, so we return 2.
//Example 2:
//
//Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
//Output: 2
//Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
import java.util.*;
public class Minimum_Common_Value {
    public int getCommon(int[] nums1, int[] nums2) {

        HashSet<Integer>st=new HashSet<>();
        for(int i:nums1){
            st.add(i);
        }

        for(int i=0;i<nums2.length;i++){
            if(st.contains(nums2[i])){
                return nums2[i];
            }
        }
        return -1;

    }
}
