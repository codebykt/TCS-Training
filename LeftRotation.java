import java.util.Scanner;

public class LeftRotation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the no.of rotating: ");
        int d = sc.nextInt();
        System.out.print("Before Rotating: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
        while (d != 0) {
            int temp = arr[n-1];
            for(int i=n-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;

            d--;            
        }
        System.out.print("\nAfter Rotating: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
