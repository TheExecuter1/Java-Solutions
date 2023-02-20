import java.util.*;

public class maxEleInArr {

    static class Pair {
        int min;
        int max;
    };
    

    
    static Pair mexEle(int arr[], int n) {
        Pair minmx = new Pair();
        if (n == 1){
            minmx.min = arr[0];
            minmx.max = arr[0];
            return minmx;
        }

        if(arr[0]>arr[1]){
            minmx.max = arr[0];
            minmx.min = arr[1];
        }
        else{
            minmx.max = arr[1];
            minmx.min = arr[0];
        }

        for(int i=2 ; i<n; i++){
            if (arr[i] > minmx.max) {
                minmx.max = arr[i];
            } else if (arr[i] < minmx.min) {
                minmx.min = arr[i];
            }
        }

        return minmx;
    }


    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        
        Pair minmx=  mexEle(arr,n);
        System.out.println("min" + minmx.min);
        System.out.println("max" + minmx.max);

    }
}
