/**
 * Created by AKI on 2017-11-08.
 */
public class DetectCapital {
    public static void main(String[] args) {
        System.out.print(detectC("GooGle"));
    }

    public static boolean detectC(String input){

        if(input.equals(input.toLowerCase()) || input.equals(input.toUpperCase())){
            return true;
        }else{
           char first =  Character.toUpperCase(input.charAt(0));
           String ans = first + input.substring(1);
           input = first + input.toLowerCase().substring(1);
           if(ans.equals(input)) return true;
        }

        return false;
    }
}
