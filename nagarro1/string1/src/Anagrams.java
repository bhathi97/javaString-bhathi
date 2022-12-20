import java.util.Arrays;

public class Anagrams {
    // a word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp
    // ekama akuru tika | pilivala wedagath naha

    public void isAnagram(String x, String y){
        x=x.toLowerCase();
        x=x.replace(" ","");

        y=y.toLowerCase();
        y=y.replace(" ","");

        char[] array1 = x.toCharArray();
        char[] array2 = y.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean sol = Arrays.equals(array1,array2);

        if (sol == true){
            System.out.println("is an anagram");
        }else {
            System.out.println("not an anagram");
        }
    }
}
