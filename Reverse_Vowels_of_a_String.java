
//345. Reverse Vowels of a String
//        Easy
//        3.3K
//        2.4K
//        Companies
//        Given a string s, reverse only all the vowels in the string and return it.
//
//        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//        Example 1:
//
//        Input: s = "hello"
//        Output: "holle"
//        Example 2:
//
//        Input: s = "leetcode"
//        Output: "leotcede"



public class Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        int i = 0;
        int j  = s.length() - 1;
        char[] ch = s.toCharArray();

        while (i < j) {
            while (i < s.length () && !isVowel(ch[i])) {
                i++;
            }
            while (j >= 0 && !isVowel(ch[j])) {
                j--;
            }
            if (i < j) {
                swap(ch, i++, j--);
            }
        }
        String bag="";
        for(char x:ch){
            bag+=x;
        }
        return bag;
    }
    static boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
    static void swap(char[] ch, int a, int b) {
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
    }
}
