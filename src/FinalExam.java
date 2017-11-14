import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AKI on 2017-10-31.
 */
public class FinalExam {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};

        // 1.
        //        System.out.println(kDiffPairs(input,0));

        // 2.
        //        System.out.println(validPalindrome("abca"));

        // 3.
        //        System.out.println(sumOfSquare(2));

        // 4.
        //        System.out.println(maximumProduct(input));

        // 5.
        //        int[] a = {1,2,2,1};
        //        int[] b = {2,2};
        //        System.out.println(Arrays.toString(findIntersection(a,b)));

        // 6.
        //        System.out.println(Arrays.toString(rotateArry(input,3)));

        // 7.
        //        System.out.print(reverseBits(43261596));

        // 8.
        //        System.out.println(largestPalindrome(2));

        // 9.
        //        System.out.println(checkParenthesis("(*)"));


        // 10.
        //        iconScaling(3);

        // 11.
        //        System.out.print(bigBangSecrets(3, "FXAB"));

    }


    // 1. K-diff Pairs in an Array

    public static int kDiffPairs(int[] nums, int k){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] - nums[j] == k || nums[i] - nums[j] == -k){
                    count++;
                }
            }
        }
        return count;
    }



    // 2. Valid Palindrome ii

    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++; j--;
        }

        if (i >= j) return true;

        if (isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1)) return true;
        return false;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++; j--;
            }
            else return false;
        }
        return true;
    }



    // 3. Sum of Square Numbers

    public static boolean sumOfSquare(int c){
        for(int i = 0; i <= c/2; i++){
            for(int j = 0; j <= c/2; j++){
                if(Math.pow(i,2) + Math.pow(j,2) == c){
                    return true;
                }
            }
        }
        return false;
    }



    // 4. Maximum Product of Three Numbers

    public static int maximumProduct(int[] nums){
        Arrays.sort(nums);

        return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    }



    // 5. Intersection of Two Arrays ii

    public static int[] findIntersection(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> aList = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> list = new ArrayList<>();
        if(nums1 == nums2){
            return nums1;
        }else{
            for(int i = 0; i < nums1.length; i++){
                if(bList.contains(aList.get(i))){
                    list.add(nums1[i]);
                }
                bList.remove(aList.get(i));
            }
            return list.stream().mapToInt(i->i).toArray();
        }
    }



    // 6. Rotate Array

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



    // 7. Reverse Bits

    public static int reverseBits(int input){
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



    // 8. Largest Palindrome Product

    public static int largestPalindrome(int n){
        int max = (int)(Math.pow(10,n)-1);
        int min = max/10+1;
        for(int i = max; i >= min; i--){
            for(int j = max; j >= min; j--){
                int input = i*j;
                if(checkPalindrome(input)){
                    return input%1337;
                }
            }
        }
        return 0;
    }

    public static boolean checkPalindrome(int num){
        String s = String.valueOf(num);
        String reversed = new StringBuilder(s).reverse().toString();
        if(s.equals(reversed)){
            return true;
        }else{
            return false;
        }
    }



    // 9. Valid Parenthesis String

    public static boolean checkParenthesis(String input){
        int min = 0;
        int max = 0;
        for(char chr: input.toCharArray()){
            if(chr == '('){
                min++;
                max++;
            }else if(chr == ')'){
                if(min > 0){
                    min--;
                }
                max--;
            }else {
                if(min > 0){
                    min--;
                }
                max++;
            }

            if(max < 0){
                return false;
            }
        }
        return min == 0;
    }



    // 10. Icon Scaling

    public static void iconScaling(int k){
        char[] a = {'*','x','*'};
        char[] b = {' ','x','x'};
        char[] c = {'*',' ','*'};
        printIcon(a,k);
        printIcon(b,k);
        printIcon(c,k);

    }

    public static void printIcon(char[] input, int k){
        for(int x = 1; x <= k; x++) {
            for (int i = 0; i < input.length; i++) {
                for (int j = 1; j <= k; j++) {
                    System.out.print(input[i]);
                }
            }
            System.out.print("\n");
        }
    }



    // 11. BigBang Secrets

    public static String bigBangSecrets(int k, String s){

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] sArry = s.toCharArray();
        for(int i = 0; i <sArry.length; i++){
            int pos = alphabet.indexOf(sArry[i]) - (3*(i+1) + k);
            if(pos < 0){
                pos = pos + 26;
            }
            sArry[i] = alphabet.charAt(pos);
        }

        return new String(sArry);

    }


}
