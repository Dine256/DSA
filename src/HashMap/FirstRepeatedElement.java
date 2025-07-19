package HashMap;
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,5};
        System.out.println(firstRepeatedElement(arr));
    }

    static int firstRepeatedElement(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        int first= 0;
        for (int i=0; i < arr.length; i++) {
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
           }
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])>1){
                first=arr[i];
                System.out.println (map.get(arr[i]));
            }
        }

        return first;
    }
}
