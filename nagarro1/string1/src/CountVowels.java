public class CountVowels {

    public void count(String x){
        x=x.toUpperCase();
        char[] y = x.toCharArray();
        int size = y.length;
        int i = 0;
        int vowelCnt = 0;
        int constCnt = 0;
        int specialCnt = 0;

        while(i!=size){
            if(y[i]>= 'A' && y[i]<= 'Z'){
                if (y[i]=='A'|| y[i]=='E' || y[i]=='I' ||y[i]=='O' ||y[i]=='U'){
                    ++vowelCnt;
                }else {
                    ++constCnt;
                }
            }else{
                ++specialCnt;
            }
            i++;
        }
        System.out.println(x);
        System.out.println("Vowel count : " + vowelCnt);
        System.out.println("Constant count : " + constCnt);
        System.out.println("Special count : " + specialCnt);
    }
}
