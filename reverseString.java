//7. Reverse Integer
//        Medium
//        10.4K
//        12K
//        Companies
//        Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//
//
//        Example 1:
//
//        Input: x = 123
//        Output: 321
//        Example 2:
//
//        Input: x = -123
//        Output: -321
//        Example 3:
//
//        Input: x = 120
//        Output: 21




public class reverseString {

        public int reverse(int x) {
            long rev=0;
            while(x!=0) {
                rev=rev*10+x%10;
                x=x/10;
            }
            int a=Integer.MAX_VALUE;
            int b=Integer.MIN_VALUE;
            if(rev>a || rev<b){
                return 0;
            }
            return (int)rev;

        }
    }

