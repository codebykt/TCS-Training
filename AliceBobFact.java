import java.util.*;


class AliceBobFact{

    static int fact(int n){
        if (n==0 || n==1) return 1;
        return n*fact(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no.of words: ");
        int n = sc.nextInt();
        System.out.println("Total no.of ways the words can be arranged : " + fact(n));

        
    }
    
}