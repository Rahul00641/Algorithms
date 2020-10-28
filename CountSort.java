package MyPackage;

public class CountSort {

    public static void main(String[] args){

        int[] ar = new int[]{2,3,1,5,3,5,3,2,5,7,9,6,3,5,3};
        int[] count = new int[9+1];
        for(int i=0;i<ar.length;i++){
            count[ar[i]]++;
        }
        for(int i=1;i< count.length;i++){
            count[i]+=count[i-1];
        }
        int[] result = new int[ar.length];
        for(int i=ar.length-1;i>=0;i--){
            count[ar[i]]--;
            result[count[ar[i]]]=ar[i];
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(result[i]+" ");
        }

    }

}
