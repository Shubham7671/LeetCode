import java.util.*;

//1684. Count the Number of Consistent Strings
//        Easy
//        1.4K
//        57
//        Companies
//        You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
//
//        Return the number of consistent strings in the array words.
//
//
//
//        Example 1:
//
//        Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//        Output: 2
//        Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
//        Example 2:
//
//        Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
//        Output: 7
//        Explanation: All strings are consistent.
//        Example 3:
//
//        Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
//        Output: 4
//        Explanation: Strings "cc", "acd", "ac", and "d" are consistent.




public class Count_the_Number_of_Consistent_Strings {
        public int countConsistentStrings(String allowed, String[] words) {
            int count=words.length;
            HashSet<Character> st= new HashSet<>();
            for(int i=0;i<allowed.length();i++){
                char c=allowed.charAt(i);
                st.add(c);
            }

            for(int i=0;i<words.length;i++){

                for(int j=0;j<words[i].length();j++){
                    char c=words[i].charAt(j);

                    if(!st.contains(c)){
                        count--;
                        break;
                    }
                }

            }
            System.out.println(st.size());
            return count;
        }

}
