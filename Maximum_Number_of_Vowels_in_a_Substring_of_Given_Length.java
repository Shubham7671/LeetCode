//1456. Maximum Number of Vowels in a Substring of Given Length
//Medium
//2K
//68
//Companies
//Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
//
//Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
//
//
//
//Example 1:
//
//Input: s = "abciiidef", k = 3
//Output: 3
//Explanation: The substring "iii" contains 3 vowel letters.
//Example 2:
//
//Input: s = "aeiou", k = 2
//Output: 2
//Explanation: Any substring of length 2 contains 2 vowels.
//Example 3:
//
//Input: s = "leetcode", k = 3
//Output: 2
//Explanation: "lee", "eet" and "ode" contain 2 vowels.
public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public int maxVowels(String s, int k) {
        int count = 0;
        char arr[] = s.toCharArray();
        for(int i = 0; i<k; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                count++;
        }
        int max = count;
        for(int i = k; i<arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                count++;
            if(arr[i-k] == 'a' || arr[i-k] == 'e' || arr[i-k] == 'i' || arr[i-k] == 'o' || arr[i-k] == 'u')
                count--;
            max = Math.max(count, max);
        }
        return max;
    }





}
