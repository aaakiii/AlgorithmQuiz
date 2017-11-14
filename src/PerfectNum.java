/**
 * Created by AKI on 2017-11-08.
 */
public class PerfectNum {
    public static void main(String[] args) {
        System.out.print(checkPerfectNumber(28));
    }


    public static boolean checkPerfectNumber(int num) {
        if (num == 1) return false;

        int result = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                result += i;
                if (i != num / i){
                    result = result + (num / i);
                }
            }
        }
        result = result +1;

        return result == num;
    }

}
