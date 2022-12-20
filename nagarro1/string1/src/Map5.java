import java.util.LinkedHashMap;
import java.util.Map;

public class Map5 {
    // Print maximum occuring character

    public void maxValue(String s){
        char[] y = s.toCharArray();
        int size = y.length;
        int i = 0;
        Map<Character,Integer> map = new LinkedHashMap<>();
        while(i != size){
            if(map.containsKey(y[i]) == false){
                map.put(y[i],1);
            }else{
                int oVal = map.get(y[i]);
                int nVal = oVal + 1;
                map.put(y[i],nVal);
            }
            i++;
        }
        Integer maxVal = 0;
        Character maxChar = ' ';

        for(Character dt : map.keySet()){
            Integer val = map.get(dt);
            if(val > maxVal){
                maxChar = dt;
                maxVal = val;
            }
        }
        System.out.println(maxChar);

    }
}
