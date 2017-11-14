import java.util.ArrayList;
import java.util.List;

/**
 * Created by AKI on 2017-10-27.
 */
public class BigBangSecrets {

    public static void main(String[] args) {

        System.out.println(checkSecrets(5,"JTUSUKG"));
    }

    public static String checkSecrets(int k, String word){
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] a = word.toCharArray();

        for(int i = 0; i < a.length; i++) {
            int pos = 3 * (i+1) + k;
            int newPos = s.indexOf(a[i]) - pos;
            if(newPos < 0){
                newPos = newPos + 26;
            }
            a[i] = s.charAt(newPos);

        }
        return new String(a);

    }

}
