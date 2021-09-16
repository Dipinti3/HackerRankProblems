
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class SockMerchantProblem {
    public static void main(String[] args) {
        Integer[] array={1,2,1,2,1,3,2};
        List<Integer> ar= Arrays.asList(1,2,1,2,1,3,2);
        System.out.println("Total Sock Pairs= "+SockMerchantProblem.sockMerchant(7,ar));
    }

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int result=0;
        Map<Integer,Integer> myMap=new HashMap<>();

        for(int i=0;i<n;i++){
            if(myMap.containsKey(ar.get(i))) {
                int value=myMap.get(ar.get(i));
                value++;
                myMap.replace(ar.get(i),value);
            }
            else{
                myMap.put(ar.get(i),1);
            }
        }
        System.out.println("HashMap: "+myMap.toString());

        for (Integer i : myMap.values()) {
            result=result+(i/2);
        }
        return result;
    }

}
