import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AKI on 2017-10-30.
 */

//Given two arrays, write a function to compute their intersection.
//Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] a = {1,2,2,3};
        int[] b = {1,2,3};
        System.out.println(Arrays.toString(findIntersection(a,b)));

    }

    public static int[] findIntersection(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
        List<Integer> list = new ArrayList<>();
        if(a == b){
            return a;
        }else{
            for(int i = 0; i < a.length; i++){
                if(bList.contains(aList.get(i))){
                    list.add(a[i]);
                }
                bList.remove(aList.get(i));
            }
            int[] result = list.stream().mapToInt(i->i).toArray();
            return result;
        }
    }
}
