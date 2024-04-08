import java.util.Scanner;

public class HAndShake {


    static int fact(int n){
        if (n==0) return 1;
        return n*fact(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the T value: ");
        int no = sc.nextInt();
        for(int i=0; i<no; i++){
            System.out.print("Enter the no.of Members: ");
            int n = sc.nextInt();
            int res = fact(n)/(fact(n-2)*fact(2));
            System.out.println("Total Hand Shakes: " + res);

            
        }
    }
}
