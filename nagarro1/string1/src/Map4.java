import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map4 {
    //what is first non repeating character
    // Linked Hash Map

    public void firstChar(String s){
        char[] y = s.toCharArray();
        int size = y.length;

        Map<Character,Integer> map = new LinkedHashMap<>();
        int i = 0;
        while (i != size){
            //put the key if absent
            if(map.containsKey(y[i]) == false){
                map.put(y[i],1);
            }else{
                // put val if key is present
                int oVal = map.get(y[i]);
                int nVal = oVal + 1;
                map.put(y[i],nVal);
            }
            i++;
        }

        for(Character dt : map.keySet()){
            Integer val = map.get(dt);
            if(val == 1) {
                System.out.println(dt);
                System.exit(0);
            }
        }
    }
}
