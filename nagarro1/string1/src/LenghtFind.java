public class LenghtFind {
    public void findLength(String x){
        //String x = "bhathiya akalanka";
        x = x.concat("\0");
        char[] y = x.toCharArray(); // convert to an array

        int count =0; // to collect the count
        int i = 0; // to go though the array
        while(y[i]!='\0'){
            count++;
            i++;
        }
        System.out.println(count);
    }

}
