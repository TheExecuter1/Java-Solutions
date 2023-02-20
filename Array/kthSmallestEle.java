import java.util.*;


public class kthSmallestEle{
    public static void kthSmall(int arr[] , int n , int k){
        k--;
        Set<Integer> s = new TreeSet<Integer>();
        for(int i=0 ; i<n ;i++){
            s.add(arr[i]);
        }

        Iterator<Integer> itr = s.iterator();

        while(k>0){
            itr.next();
            k--;
        }
        System.out.println(itr.next());
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n];
        for (int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        s.close();
        kthSmall(arr,n , k);
        //System.out.println(res);

    }
}
