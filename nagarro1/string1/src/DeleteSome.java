public class DeleteSome {
    //to delete all occurrences og a given character

    public void deleting(String s, Character key){
        char[] y = s.toCharArray();
        int i = 0;
        int size = s.length();
        String res = "";

        while(i != size){
            if(y[i] != key){
                res = res + y[i];
            }
            i++;
        }
        System.out.println(res);
    }
}
