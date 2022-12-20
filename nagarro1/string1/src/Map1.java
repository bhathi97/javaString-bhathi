import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {

    // get
    // put
    // HashMap: hash function
    // LinkedHashMap : sequence as the input
    // TreeMap : data ascending order

    public void mapping(String string){
        char[] y = string.toCharArray();
        int size = y.length;

        Map<Character,Integer> map = new LinkedHashMap<>();
        int i =0;
        //----------------------------------------------------
        while (i != size){
            if (map.containsKey(y[i]) == false) {
                map.put(y[i],1);
            }else{
                int oldVal = map.get(y[i]);
                int newVal = oldVal + 1 ;
                map.put(y[i],newVal);
            }
            ++i;
        }
        //-----------------------------------------------------
        for(Character data : map.keySet()){
            System.out.printf("%s%d",data,map.get(data));
        }
    }
}
