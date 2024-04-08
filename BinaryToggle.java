import java.util.*;


public class BinaryToggle {

    static String tobinary(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int temp = n % 2;
            sb.append(temp);
            n/=2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int n = sc.nextInt();
        // String bin = Integer.toBinaryString(n);
        String bin = tobinary(n);
        StringBuilder newString = new StringBuilder();
        for(int i=0; i<bin.length(); i++){
            if(bin.charAt(i) == '1'){
                newString.append('0');
            }else{
                newString.append('1');

            }
        }
        System.out.println("Binary Value: " + bin);
        System.out.println("Binary Value after Toggling : " + newString);

        System.out.println("Decimal value after toggling: " + Integer.parseInt(newString.toString(),2));
        
        

 
    }
}
