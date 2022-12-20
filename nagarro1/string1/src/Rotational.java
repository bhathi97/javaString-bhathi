public class Rotational {
    //verify if one string is rotation of another string
    //rotational --> bhathi => ibhath

    public void rotatopnChech(String original, String check){
        String newString = original.concat(original);
        if(newString.contains(check)){
            System.out.println("Rotational");
        }else{
            System.out.println("no");
        }
    }

}
