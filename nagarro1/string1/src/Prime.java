public class Prime {
    //find nth prime number

    public int primeNo(int n){
        int result = 1;
        int count =0;
        int i;

        while (count<n) {
            result = result + 1;
            for (i = 2; i < result; i++) {
                if (result % i == 0) {
                    break;
                }
            }
            if (i == result) {
                count = count + 1;
            }
        }
        return result;
    }

}
