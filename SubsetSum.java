import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetSum {


    static void recur(int i,int arr[], List<Integer> l, int k ){
        if(k == 0){
            System.out.println(l);
            return;
        }
        if(i>=arr.length){
            return; 
        }
        l.add(arr[i]);
        recur(i+1, arr, l, k-arr[i]);
        l.remove(l.size()-1);
        recur(i+1, arr, l, k);

    }

    /*static void recur(int i, int arr[], List<Integer> l, int k) {
    if (k == 0) {
        System.out.println(l);
        return;
    }
    if (i >= arr.length) {
        return;
    }
    l.add(arr[i]);
    recur(i + 1, arr, l, k - arr[i]);
    l.remove(l.size() - 1);
    recur(i + 1, arr, l, k);
} */
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the sum(K): ");
        int k = sc.nextInt();
        recur(0, arr, l, k);

        
    }
}
 