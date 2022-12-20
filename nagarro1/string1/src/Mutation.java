public class Mutation {
    //mutable == can be changed
    //immutable == cannot be changed

    public void mutationCheck (String a, String b){
        a.concat(b);
        System.out.println(a);
        //concat not work therefore strings are immutable
    }
    public void mutationCheck2 (String a, String b){
        StringBuffer x = new StringBuffer(a);
        StringBuffer y = new StringBuffer(b);
        x.append(y);
        System.out.println(x);
    }




}
