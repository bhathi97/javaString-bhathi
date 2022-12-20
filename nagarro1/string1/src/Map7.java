import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map7 {
    // How to remove duplicate characters

    public void removeDup(String s){
        char[] y = s.toCharArray();
        int size = y.length;
        int i = 0;
        Map<Character,Integer> map = new LinkedHashMap<>();
        while(i != size){
            if(map.containsKey(y[i])== false){
                map.put(y[i],1);
            }else{
                Integer oldVal = map.get(y[i]);
                Integer newVal = oldVal + 1;
                map.put(y[i],newVal);
            }
            i++;
        }

        String res = "";
        for(Character data :  map.keySet()){
                res = res + data;
        }
        System.out.println(res);
    }

}
