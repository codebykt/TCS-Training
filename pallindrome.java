import java.util.Scanner;

public class pallindrome {
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the String: ");
    //     String strr = sc.nextLine();
    //     StringBuilder sb = new StringBuilder(strr);
    //     if(strr.equals(sb.reverse().toString())){
    //         System.out.println("PALINDROME");
    //     }else{
    //         System.out.println("NOT A PALINDROME");
    //     }
    //     // System.out.println(sb ==sb.reverse());

    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String strr = sc.nextLine();

        int start = 0,end = strr.length()-1;
        while (start < end) {
            if(strr.charAt(start) != strr.charAt(end)){
                System.out.println("NOT A PALINDROME");
                return;
            }

            start++;
            end--;
            
        }
            System.out.println("PALINDROME");


    }
}
