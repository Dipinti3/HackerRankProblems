import java.util.*;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6,7,8,9,10,11};
        List<Integer> reversedList=new ArrayList<>();
        reverse(a);
        reversedList= Arrays.asList(a);
        System.out.println(reversedList);
    }

    private static void reverse(Integer[] a) {
        int temp;
        for (int i = 0; i < a.length/2; i++) {
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
    }
}
