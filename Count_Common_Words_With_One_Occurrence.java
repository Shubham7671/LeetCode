//
import java.util.*;
//2085. Count Common Words With One Occurrence
//        Easy
//        627
//        13
//        Companies
//        Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
//
//
//
//        Example 1:
//
//        Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
//        Output: 2
//        Explanation:
//        - "leetcode" appears exactly once in each of the two arrays. We count this string.
//        - "amazing" appears exactly once in each of the two arrays. We count this string.
//        - "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
//        - "as" appears once in words1, but does not appear in words2. We do not count this string.
//        Thus, there are 2 strings that appear exactly once in each of the two arrays.
//        Example 2:
//
//        Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
//        Output: 0
//        Explanation: There are no strings that appear in each of the two arrays.
//        Example 3:
//
//        Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"]
//        Output: 1
//        Explanation: The only string that appears exactly once in each of the two arrays is "ab".


public class Count_Common_Words_With_One_Occurrence {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> mp1=new HashMap<>();
        HashMap<String,Integer> mp2=new HashMap<>();
        int count=0;
        for(String a:words1){
            mp1.put(a,mp1.getOrDefault(a,0)+1);
        }
        for(String a:words2){
            mp2.put(a,mp2.getOrDefault(a,0)+1);
        }
        for (Map.Entry<String,Integer> e : mp1.entrySet()) {
            if(e.getValue()==1){
                if(mp2.containsKey(e.getKey()))
                    if(mp2.get(e.getKey())==1){
                        count++;
                    }
            }
        }
        return count;
    }
}
