public class LengthOfString {
    public static void main(String[] args) {
        String x= "ha ";
        //System.out.println(x.length()); //Don't use in interview
        x= x.concat("0");

        char y[]= x.toCharArray();
        int count= 0;
        int i= 0;

        while(y[i] != '0'){
            count++;
            i++;
        }
        System.out.println(count);

        // to call another method in another class, we use object
        CallExternalMethod callExternalMethod = new CallExternalMethod();
        int c = callExternalMethod.Method(2,3);
        System.out.println("this is return value = "+ c);

    }
}
