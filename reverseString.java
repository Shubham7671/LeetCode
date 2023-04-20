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
