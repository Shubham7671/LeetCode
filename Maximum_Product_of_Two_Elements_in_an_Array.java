




import java.util.*;
public class Maximum_Product_of_Two_Elements_in_an_Array {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1) ;
    }
}
