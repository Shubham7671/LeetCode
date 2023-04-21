
//42. Trapping Rain Water
//        Hard
//        26K
//        357
//        Companies
//        Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//
//
//
//        Example 1:
//
//
//        Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//        Output: 6
//        Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
//        Example 2:
//
//        Input: height = [4,2,0,3,2,5]
//        Output: 9





public class Trapping_Rain_Water {
    public int trap(int[] height) {
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++)
            leftMax[i]=Math.max(leftMax[i-1],height[i]);

        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        int res=0;
        for(int i=0;i<height.length;i++)
            res+= Math.min(leftMax[i],rightMax[i])-height[i];

        return res;
    }
}
