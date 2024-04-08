import java.util.*;

public class RemoveDuplicatesAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                System.out.println("INVALID INPUT!!!!!!!!!");
                return;
            }
        }

        int temp = arr[0];

        for(int i=1; i<n; i++){
            while(arr[i] == arr[i-1]){
                arr[i] += 1;
            }

        }
        int sum = 0;
        for(int x:arr){
            sum += x;
        }
        System.out.println("Total: " + sum);
        

    }
}
