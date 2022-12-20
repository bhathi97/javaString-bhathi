public class Verify {
    //verify is string is empty ==> length = 0

    public void veryfyEmpty(String s){
        int length = s.length();
        if(length == 0){
            System.out.println("empty string");
        }else{
            System.out.println("not empty");
        }
    }
}
