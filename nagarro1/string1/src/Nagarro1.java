public class Nagarro1 {
    //convert C variable to java variable and vice varsa
    public String modifyVariableName(String s){
        String res = "";
        char[] y = s.toCharArray();
        if(s.contains("_")){
            System.out.println("its c");
            for(int i = 0; i < y.length; i++){
                if(y[i] != '_'){
                    if( i != 0 && y[i-1] == '_'){
                        res = res + String.valueOf(y[i]).toUpperCase();
                    }else{
                        res = res + y[i];
                    }
                }
            }
        }else{
            System.out.println("its java");
            for(int i=0; i< y.length ; i++){
                if(i != 0 && (String.valueOf(y[i]).equals(String.valueOf(y[i]).toUpperCase()))){
                    res =  res + '_' + String.valueOf(y[i]).toLowerCase();
                }else{
                    res = res + y[i];
                }
            }
        }
        return res;
    }



}
