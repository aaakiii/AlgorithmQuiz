import java.util.Arrays;

/**
 * Created by AKI on 2017-10-27.
 */
public class LargestPalindrome {
    public static void main(String[] args) {
        System.out.println(findPalindrome(2));
    }

    public static int findPalindrome(int digit) {
        if(digit == 1){
            return  9;
        }
        int maxNum = (int) Math.pow(10, digit) - 1;
        int minNum = maxNum / 10 + 1;
        int ans  = 0;
        for (int i = maxNum; i >= minNum; i--) {
            int input = i * maxNum;
            if (checkPalindrome(input) == true){
                ans = input % 1337;
                break;
            }
        }
        return ans;
    }

    private static boolean checkPalindrome (long input) {

        String s = String.valueOf(input);
        String reverse = new StringBuilder(s).reverse().toString();
        if(s.equals(reverse)){
            return true;
        }else {
            return false;
        }

    }

    public int largestPalindrome(int n) {
        if (n==1) return 9;
        int max=(int)Math.pow(10, n)-1;
        for (int v=max-1;v>max/10;v--) {
            long u=Long.valueOf(v+new StringBuilder().append(v).reverse().toString());
            for (long x=max;x*x>=u;x--)
                if (u%x==0)
                    return (int)(u%1337);
        }
        return 0;
    }
}
