package MyPackage.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {

    public static void main(String[] args){

        Scanner in =new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];
        int maxElement = 0 ;
        for(int i=0;i<size;i++){
            ar[i] = in.nextInt();
            if(ar[i]>maxElement)maxElement=ar[i];
        }
        int[] count = new int[maxElement+1];
        for(int i=0;i<size;i++){
            count[ar[i]]++;
        }
        for(int i=1;i< maxElement+1;i++){
            count[i]+=count[i-1];
        }
        int[] result = new int[size];
        for(int i=size-1;i>=0;i--){
            count[ar[i]]--;
            result[count[ar[i]]]=ar[i];
        }
        for(int i=0;i<size;i++){
            System.out.print(result[i]+" ");
        }

    }

}
