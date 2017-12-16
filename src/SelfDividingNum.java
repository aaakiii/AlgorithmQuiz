import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by AKI on 2017-12-15.
 */
public class SelfDividingNum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SelfDivid(1,22)));

    }

    public static int[] SelfDivid(int right, int left) {

        ArrayList<Integer> resultList = new ArrayList<Integer>();
        //配列内各数字ごとにチェック
        for(int i = right; i <= left; i++){
            // 10未満なら無条件にadd
            if(i < 10){
                resultList.add(i);
            } else {
                // 各数字の桁ごとに割り切れるかチェック
                ArrayList<Integer> intArry = new ArrayList<Integer>();
                while(i > 0){
                    intArry.add(i%10);
                    i = i/10;
                }
                Collections.reverse(intArry);
                int[] arr = intArry.stream().mapToInt(x -> x).toArray();
                for(int j = 0; j < intArry.size(); j++){
                    int count = 0;
                    if(arr[j] != 0 && i % arr[j] == 0){
                        count++;
                        System.out.println(count);
                    }
                    if(count == intArry.size()){
                        resultList.add(i);
                    }
                }
            }
        }

        Integer[] resultInteger = resultList.toArray(new Integer[resultList.size()]);
        int[] result = Arrays.stream(resultInteger).mapToInt(Integer::intValue).toArray();

        return result;
    }
}
