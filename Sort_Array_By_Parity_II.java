

//922. Sort Array By Parity II
//        Easy
//        2.3K
//        84
//        Companies
//        Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
//
//        Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
//
//        Return any answer array that satisfies this condition.
//
//
//
//        Example 1:
//
//        Input: nums = [4,2,5,7]
//        Output: [4,5,2,7]
//        Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
//        Example 2:
//
//        Input: nums = [2,3]
//        Output: [2,3]
import java.util.*;
public class Sort_Array_By_Parity_II {
    public int[] sortArrayByParityII(int[] nums) {
        Stack<Integer> se=new Stack<>();
        Stack<Integer> so=new Stack<>();
        for(int i:nums){
            if(i%2==0)
                se.push(i);
            if(i%2!=0)
                so.push(i);
        }
        int arr[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=se.pop();
            }else{
                arr[i]=so.pop();
            }




        }
        return arr;
    }
}
