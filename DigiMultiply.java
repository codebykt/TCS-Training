import java.util.*;
public class DigiMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int res = 1;
        while(n > 0){
            res *= (n%10);
            n/=10;
        }
        System.out.println("Total : " + res);
        
    }
}
