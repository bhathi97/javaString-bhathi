public class ConvertUpperLow {

    //lowerCase - 32 = upperCase
    //lowerCase = upperCase + 32

    public void convertToUpper(String ascii1){
        char[] y = ascii1.toCharArray();
        int size = y.length;

        int i = 0;
        while(i!=size){
            y[i] = (char)(y[i]-32);
            ++i;
        }
        System.out.println(ascii1);
        System.out.println(y);
    }

    public void convertHaveSpace(String x){
        char[] y = x.toCharArray();
        int size = y.length;
        int i = 0;
        while (i!=size){
            if (y[i]!=' '){
                y[i] = (char)(y[i]-32);
            }
            ++i;
        }
        System.out.println(x);
        System.out.println(y);
    }

    public void convertFirstCharactor(String x){
        char[] y = x.toCharArray();
        int size = x.length();

        y[0] =(char) (y[0]-32); //convert first letter to capital
        int i = 1;
        while(i!=size){
            if(y[i] == ' '){
                y[i+1]=(char)(y[i+1]-32);
            }
            ++i;
        }
        System.out.println(x);
        System.out.println(y);

    }



}
