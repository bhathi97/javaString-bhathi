import javax.print.attribute.standard.PresentationDirection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Nagarro2 {
    //find frequencies of a given String

    public String findFrequency(String s){
        String res ="";
        char[] y = s.toCharArray();
        int size = s.length();
        int i = 0;

        Map<Character,Integer> map = new LinkedHashMap<>();
        while(i != size){
            if(map.containsKey(y[i]) == false){
                 map.put(y[i],1);
            }else{
                Integer oVal = map.get(y[i]);
                Integer nVal = oVal + 1 ;
                map.put(y[i], nVal);
            }
            i++;
        }
        for(Character dt : map.keySet()){
            res = res + dt + map.get(dt);
        }

        return res;
    }
}
