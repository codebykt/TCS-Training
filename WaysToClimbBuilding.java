import java.util.Scanner;

public class WaysToClimbBuilding {

    static int fibno(int n){
        if(n == 0 || n == 1) return 1;
        return fibno(n-1) + fibno(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Steps: ");
        int n = sc.nextInt();
        System.out.println("Total no.of Ways to climb the building is " + fibno(n));
    }
}
