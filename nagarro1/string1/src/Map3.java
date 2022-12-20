import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map3 {

    // Print NON repeated characters

    public void nonRep(String str){
        char[] y= str.toCharArray();
        int size = y.length;

        Map<Character,Integer> map = new LinkedHashMap<>();
        int i = 0;

        while(i != size){
            if(map.containsKey(y[i]) == false){
                map.put(y[i],1);
            }else{
                int oVal = map.get(y[i]);
                int nVal = oVal + 1;
                map.put(y[i],nVal);
            }
            ++i;
        }
        for(Character data : map.keySet()){
            Integer val = map.get(data);
            if(val == 1){
                System.out.println(data);
                System.out.println(map.get(data));
            }
        }
    }
}
