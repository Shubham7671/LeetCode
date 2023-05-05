//1122. Relative Sort Array
//Easy
//2.2K
//129
//Companies
//Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
//
//Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
//
//
//
//Example 1:
//
//Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//Output: [2,2,2,1,4,3,3,9,6,7,19]
//Example 2:
//
//Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
//Output: [22,28,8,6,17,44]
import java.util.*;
public class Relative_Sort_Array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i:arr1){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int ans[]=new int[arr1.length];
        int a=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<mp.get(arr2[i]);j++){
                ans[a]=arr2[i];
                a++;
            }
        }
        HashSet<Integer> st=new HashSet<>();
        for(int i : arr2){
            st.add(i);
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            if(!st.contains(arr1[i])){
                ans[a]=arr1[i];
                a++;
            }
        }


        return ans;
    }
}
