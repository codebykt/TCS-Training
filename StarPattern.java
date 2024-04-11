import java.util.Scanner;
class Patterns{
    void stepspattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }System.out.print("\n");
        }
    }
}
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N: ");
        int n = sc.nextInt();
        Patterns p = new Patterns();

        p.stepspattern(n);
    }   
}
