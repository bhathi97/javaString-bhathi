public class Panagram {

    // panagram is a sentence, verse, etc., that includes all the letters of the alphabet

    public void checkPanagram(String x){
        x = x.toUpperCase();
        x = x.replace(" ","");
        char[] y = x.toCharArray();
        char[]a = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int size = x.length();
        int i = 0;
        int j = 0;
        int index = 0;

        while (i != size){
            index = y[i] - 65;
            a[index] = 1;
            ++i;
        }
         while (j != 26){
            if (a[j] != 1){
                System.out.println("not a panagram");
                System.exit(0);
            }else {
                j++;
            }
        }
        System.out.println("is a panagram");

    }

}
