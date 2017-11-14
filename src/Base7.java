/**
 * Created by AKI on 2017-11-08.
 */
public class Base7 {

    public static void main(String[] args) {
        System.out.print(base7(100));
    }

    public static String base7(int num){
        StringBuilder result = new StringBuilder();
        if(num < 0){
            num = - num;
            result.append("-");
        }
        while(num >= 7){
            int reminder = num %7;
            result.append(String.valueOf(reminder));
            num = (num-reminder)/7;
        }
        result.append(num);
        result.reverse();
        if(result.toString().contains("-")){
            result.deleteCharAt(result.length()-1);
            result.insert(0,"-");
        }
        return result.toString();
    }
}

