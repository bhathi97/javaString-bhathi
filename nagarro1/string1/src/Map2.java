import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
    //if input string has all UNIQUE CHARACTERS or NOT
    // ex: assasa --> has repeating chars
    // ex: asdag --> no repeating chars, only unique chars

    public void unique(String s) {
        char[] y = s.toCharArray();
        int size = y.length;

        Map<Character, Integer> map = new LinkedHashMap<>();
        int i = 0;
        while (i != size) {
            if (map.containsKey(y[i]) == false) {
                map.put(y[i], 1);
            } else {
                int oVal = map.get(y[i]);
                int nVal = oVal + 1;
                map.put(y[i], nVal);
            }
            ++i;
        }

        for(Character data : map.keySet()){
            Integer val = map.get(data);
            if(val > 1){
                System.out.println("Doesnt contain unique values");
                System.exit(0);
            }
        }
        System.out.println(" unique values");

    }
}
