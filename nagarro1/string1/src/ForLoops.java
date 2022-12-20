public class ForLoops {

    public void forLoop(int[] a){
        int size = a.length;
        int summation = 0;

        for(int i = 0; i != size ; i++){
            summation = summation + a[i];

        }
        System.out.println("total: "+ summation);
    }

    public void whileLoop(int[] a){
        int size = a.length;
        int summation = 0;
        int i = 0;
        while (i != size){
            summation = summation + a[i];
            i++;
        }
        System.out.println("sum : "+ summation);
    }

    public void forEach(int[] a){
        int sum = 0;
        for(int d: a){
            sum = sum + d;
        }
        System.out.println(sum);
    }
}
