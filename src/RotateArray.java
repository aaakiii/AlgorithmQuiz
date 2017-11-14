import java.util.Arrays;


/**
 * Created by AKI on 2017-10-30.
 */

//Rotate an array of n elements to the right by k steps.
//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(rotateArry(a, 3)));
    }

    public static int[] rotateArry(int[] input, int num){
        int a, b;
        for(int i = 0; i < num; i++){
            a = input[input.length - 1];
            for(int j = 0; j < input.length; j++){
                b  = input[j];
                input[j] = a;
                a = b;
            }
        }
        return input;
    }

}
