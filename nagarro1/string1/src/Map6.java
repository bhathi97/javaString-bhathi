import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map6 {
    //how to print duplicate characters

    public void duplicates(String s){
        char[] y = s.toCharArray();
        int size = y.length;

        Map<Character,Integer> map = new LinkedHashMap<>();
        int i = 0;

        while(i !=size){
            if(map.containsKey(y[i]) == false){
                map.put(y[i],1);
            }else{
                int oldVal = map.get(y[i]);
                int newVal = oldVal + 1;
                map.put(y[i],newVal);
            }
            i++;
        }

        for(Character data : map.keySet()){
            if(map.get(data) > 1){
                System.out.println(data +" "+map.get(data));
            }
        }
    }


}
