public class Swapping {
    //swap two numbers
    public void swapTwoINt(int a, int b){
        System.out.printf("before a = %d and b = %d",a,b);
        System.out.println("");
         //a = a + b ;
         //b = a - b ;
         //a = a - b ;
         a = a + b - (b=a);
        System.out.printf("after a = %d and b = %d",a,b);
    }

    //swap odd even numbers in byte
    public void swapBytes(int a){
        int newA = ((a & 0x55)<<1 | (a & 0xAA) >> 1);
        System.out.printf("before %d",a);
        System.out.println("");
        System.out.printf("after %d",newA);
    }
}
