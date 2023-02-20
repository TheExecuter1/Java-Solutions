import java.util.*;

public class rev {
//iterative solution for reversing array
    public static void reverse(int arr[],int n) {
        int temp ;
        int start = 0 , last = n-1 ;
        while (start < last){
            temp = arr[start] ;
            arr[start] = arr[last];
            arr[last] = temp;
            start ++;
            last --;
        }
    }

    //print
    private static void printArr(int arr[], int n) {
        for (int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        reverse(arr,n);
        printArr(arr,n);
    } 
}