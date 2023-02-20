import java.util.*;;

public class sortArrayof012 {

    public static void sort012(int arr[],int n) {
        int low = 0 ;
        int mid = 0;
        int high = n-1 ;
        int temp =0 ;

        while(mid<=high){
            switch(arr[mid]) {
                case 0 : {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
            

                case  1 :{
                    mid ++ ;
                } 
                
                case 2 : {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
        }
    }

    }
    private static void printArr(int arr[], int n) {
        for (int i=0 ; i<n ; i++){
            System.out.println("ans"+arr[i]);
        }
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        s.close();
        sort012(arr,n);
        printArr(arr, n);
        //System.out.println(res);

    }
}
