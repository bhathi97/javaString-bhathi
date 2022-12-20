import java.util.*;

public class makeACopy {
    public void CopyMake(String x){
        char[] y = x.toCharArray();
        int size = y.length;
        char[] z = new char[size];

        int i = 0;
        while(i != size){
            z[i] = y[i];
            ++i;
        }
        System.out.println(y);
        System.out.println(z);

    }
}
