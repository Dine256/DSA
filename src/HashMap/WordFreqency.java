package HashMap;
import java.util.HashMap;

public class WordFreqency {
    public static void main(String[] args) {
        String [] arr={"apple banana apple mango banana apple"};
        String split="";
        HashMap<String,Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            split=arr[i].toLowerCase().replaceAll("[^a-zA-Z\\s]","");
        }
        String [] array=split.split("\\s+");
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        for(String display:map.keySet()){
            System.out.println(display+" = "+map.get(display));
        }

    }
}
