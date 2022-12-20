import java.util.*;


public class Main {

    public static void main(String[] args) {
        //String x = "bhathiya akalanka";
        //String pal1 = "too Hot to HOOT";
        //System.out.println(x);

        //LenghtFind lenghtFind = new LenghtFind();
        //lenghtFind.findLength(x);

        //makeACopy makeACopy = new makeACopy();
        //makeACopy.CopyMake(x);

        //MakeAReverse makeAReverse = new MakeAReverse();
        //makeAReverse.reverse(x);

        //Palindrome palindrome = new Palindrome();
        //palindrome.palindromeOrNot(pal1);


        //String ascii1 = "wwef wfef hhe";
        //ConvertUpperLow convertUpperLow = new ConvertUpperLow();
        //convertUpperLow.convertToUpper(ascii1);
        //convertUpperLow.convertHaveSpace(ascii1);
        //convertUpperLow.convertFirstCharactor(ascii1);

        //String sentence = "bhathiya bandara";
        //CountVowels countVowels =new CountVowels();
        //countVowels.count(sentence);

        //String a = "1111";
        //IsIntegerOrNo isIntegerOrNo = new IsIntegerOrNo();
        //isIntegerOrNo.integerOrNo1(a);
        //isIntegerOrNo.integerOrNo2(a);

        //String one= "asdasd WEED rttgt";
        //String two = "dsadsa weed Rtt gt";
        //Anagrams anagrams = new Anagrams();
        //anagrams.isAnagram(one,two);

        //String a = "abcdefghijklmnopqrstuvwyzdd dd";
        //Panagram panagram = new Panagram();
        //panagram.checkPanagram(a);

        //int[] a = {11,11,11,11,11};
        //ForLoops forLoops = new ForLoops();
        //forLoops.forLoop(a);
        //forLoops.whileLoop(a);
        //forLoops.forEach(a);

        //String s = "bhhatiyaaab";
        //String s1 = "abcd";
//        Map1 map1 = new Map1();
//        map1.mapping(s);
        //Map2 map2 = new Map2();
        //map2.unique(s);
        //map2.unique(s1);
        //Map3 map3 = new Map3();
        //map3.nonRep(s);
        //Map4 map4 = new Map4();
        //map4.firstChar(s);
        //Map5 map5 = new Map5();
        //map5.maxValue(s);
        //Map6 map6 = new Map6();
        //map6.duplicates(s);
        //Map7 map7 = new Map7();
        //map7.removeDup(s);

        //Spaces spaces = new Spaces();
        //spaces.removeSpaces("bhathiya   aka lq      dfjie");
        //spaces.removeSpases2("bhathiya   aka lq      dfjie");

        //Verify verify = new Verify();
        //verify.veryfyEmpty("null");

        //String s1 = "baseball";
        //String s2 = "colombo";
        //Mutation mutation = new Mutation();
        //mutation.mutationCheck(s1,s2);
        //mutation.mutationCheck2(s1,s2);

        //String s = "I am Bhathiya Akalanka rb";
        //Counting counting = new Counting();
        //counting.count(s);

        //String a = "bhathiya";
        //String b = "aybhathi";
        //Rotational rotational = new Rotational();
        //rotational.rotatopnChech(a,b);

        //String a = "bhathiya";
        //Character b = 'a';
        //DeleteSome deleteSome = new DeleteSome();
        //deleteSome.deleting(a,b);

        //ConvertIntStr con = new ConvertIntStr();
        //con.intToStr(22);
        //con.StrToInt("3");

        //Swapping sw = new Swapping();
        //sw.swapTwoINt(10,5);
        //sw.swapBytes(43);

        //String s  = "hA_ddaA";
        //String y = s.toLowerCase();
        //System.out.println(y);

        //Nagarro1 na1 = new Nagarro1();
        //System.out.println(na1.modifyVariableName("hahahaAkjaja"));

        //Nagarro2 nagarro2 = new Nagarro2();
        //System.out.println(nagarro2.findFrequency("bhathiya"));

        //int arrayLength= 6;
        //int[] array = {1,2,1,2,2,2};
        //Nagarro3 nagarro3 = new Nagarro3();
        //System.out.println(nagarro3.majoruty(arrayLength,array));

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("enter");
        //int n = scanner.nextInt();
        //Prime prime = new Prime();
        //System.out.println(prime.primeNo(n));

        String s = "hithere";
        char[] y = s.toCharArray();
        int size = y.length;
        int i = 0;
        Map<Character,Integer> map = new LinkedHashMap<>();
        while(i!=size){
            if(map.containsKey(y[i]) == false){
                map.put(y[i],1);
            }else{
                int oldv = map.get(y[i]);
                int newv = oldv+1;
                map.put(y[i],newv);
            }i++;
        }for(Character data : map.keySet()){
            Integer val = map.get(data);
            if (val > 1){
                System.out.println(data);
            }

        }



    }
}
