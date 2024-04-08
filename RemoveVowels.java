import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String myString = sc.nextLine();
        String res = "";
        for (int i=0; i<myString.length(); i++) {
            char temp = myString.charAt(i);

            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' ){
                continue;
            }
            res += String.valueOf(temp);            
        }
        System.out.println("Modified String: " + res);
    }
    
}
