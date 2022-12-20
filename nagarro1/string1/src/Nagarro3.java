import java.util.LinkedHashMap;
import java.util.Map;

public class Nagarro3 {
    //show more than half value of as array

    public int majoruty(int input1, int[] input2){
        int result = -1;
        int i = 0;
        Map<Integer,Integer> map = new LinkedHashMap<>();
        while(i != input1) {
            if (map.containsKey(input2[i]) == false) {
                map.put(input2[i], 1);
            } else {
                int oldVal = map.get(input2[i]);
                int newVal = oldVal + 1;
                map.put(input2[i], newVal);
            }
            i++;
        }

        for(Integer data : map.keySet()){
            if(map.get(data) > (input1/2)){
                result = data;
            }
        }

        return result;
    }
}
