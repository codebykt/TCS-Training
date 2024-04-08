import java.util.Arrays;
import java.util.Scanner;

public class FindRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr); //nlogn
        int temp = arr[n-1], flag = 1;
        for(int i=1;i<n;i++){
            if( arr[i] == arr[i-1]){
                if(flag == 1 || temp != arr[i]) System.out.println("Repeating elements are " + arr[i] );
                temp = arr[i-1];
                flag = 0;
            }
        }



    }
}
