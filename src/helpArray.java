public class helpArray {
    static void harmonicAverage(int []arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
             sum=sum+ (double)1 /arr[i];
        }
        double average=arr.length/sum;
        System.out.println("Dizinin harmonik ortalaması: "+average );
    }
}
