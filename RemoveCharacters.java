import java.util.Scanner;

public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st = sc.nextLine();
        String newString = "";
        char prev = st.charAt(0);
        for(int i=0;i<st.length();i++){
            if(Character.isDigit(st.charAt(i))){
                
                newString += String.valueOf(st.charAt(i));
                if((st.charAt(i) == '5' && st.charAt(i+1) == '6') || (st.charAt(i) == '6' && st.charAt(i-1) == '5')) continue; 
            }else{
                if((st.charAt(i) == 'F' && st.charAt(i-1) == 'E') || (st.charAt(i) == 'G') || (st.charAt(i) == 'E' && st.charAt(i+1) == 'F')){
                    continue;
                }else{
                    newString += String.valueOf(st.charAt(i));
                }
            }
        }
        System.out.println("Final String: " + newString);
    }
}
