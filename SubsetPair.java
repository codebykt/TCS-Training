import java.util.Arrays;
import java.util.Scanner;

public class SubsetPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = sc.nextInt();
        int temp = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]+arr[j] == count){
        //             temp++;
        //         }
        //     }
        // }

        int i=0,j=arr.length-1;
        Arrays.sort(arr);
        while(i<j){
            int sum = arr[i]+arr[j];
            if( sum == count ){
                System.out.println("(" + arr[i] + "," + arr[j] +")");
                temp++;
                i++;
                j--;
            }else if(sum > count){
                j--;
            }
            else i++;
            
        }

        System.out.println(temp);
    }
}
