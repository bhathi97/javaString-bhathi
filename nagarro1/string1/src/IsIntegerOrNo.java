public class IsIntegerOrNo {

    public void integerOrNo1(String x){
        char[] y = x.toCharArray();
        int size = x.length();
        int i = 0;

        while (i!=size){
            if (y[i]>='0' && y[i]<='9') {
               i++;
            }else{
                System.out.println("is not a integer string");
                System.exit(0);
            }
        }
        System.out.println("is a integer string");


    }
    public void integerOrNo2(String x){
        int size = x.length();
        int i = 0;

        while (i!=size){
            if (x.charAt(i)>='0' && x.charAt(i)<='9') {
                i++;
            }else{
                System.out.println("is not a integer string");
                System.exit(0);
            }
        }
        System.out.println("is a integer string");


    }
}
