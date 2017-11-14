
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by AKI on 2017-10-27.
 */
public class ReverseBits {

    public static void main(String[] args) {

        System.out.println(reverse(43261596));
        // 964176192
    }

    public static int reverse(int input){
        List<Integer> bits = new ArrayList<>();
        while(input >= 1){
            bits.add(input%2);
            input = input/2;
        }
        Collections.reverse(bits);
        while(bits.size() < 32){
            bits.add(0,0);
        }
        StringBuilder sb = new StringBuilder();
        for(int i : bits){
            sb.append(i);
        }

        return Integer.parseInt(sb.reverse().toString(), 2);
    }
}
