import java.util.Scanner;

public class NumbersDivisibleByTwoPermutations {

    static int fact(int n){
        if (n==0 || n==1) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int even = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] %2 == 0){
                even++;
            }
        }


        System.out.println("The total possibilities: " + (fact(n-1)*even));

        
    }
}