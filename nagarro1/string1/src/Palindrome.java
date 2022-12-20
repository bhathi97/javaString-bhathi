public class Palindrome {

    public void palindromeOrNot(String pal1){
        pal1 = pal1.replace(" ",""); //case 1: with space
        pal1 = pal1.toLowerCase(); //case 2: with mixLetters

        char[] y = pal1.toCharArray();
        int size = y.length;
        char[] a = new char[size];
        int i = 0;
        while (i != size){
            a[size-1-i] =y[i];
            i++;
        }

        int j = 0;
        while (j!=size){
            if(a[j]!= y[j]){
                System.out.println("not a a palindrome");
                System.exit(0);
            }else{
                ++j;
                //continue;
            }
        }
        System.out.println("palindrome");
    }

}
