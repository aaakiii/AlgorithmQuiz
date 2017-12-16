import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] a = { "Dad", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(checkWords(a)));
    }

    public static String[] checkWords(String[] input){
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        List<String> list = Arrays.asList(input);


        int i = 0;
        int j = 0;
        int x = 0;
        for(int y = 0; y < input.length; y++) {
            while (firstRow.indexOf(input[y].charAt(i)) >= 0) {
                i++;

            }
            while (secondRow.indexOf(input[y].charAt(j)) >= 0) {
                j++;

            }
            while (thirdRow.indexOf(input[y].charAt(x)) >= 0) {
                x++;

            }

            if (input[y].length() != i || input[y].length() != j || input[y].length() != x) {
//                list.remove(list.indexOf(y));
                System.out.println(i);
                System.out.println(j);
                System.out.println(y);
            }

        }
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }
}
