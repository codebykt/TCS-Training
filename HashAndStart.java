import java.util.*;

public class HashAndStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String st = sc.nextLine();
        int scount = 0, hcount = 0;
        for(int i=0; i<st.length(); i++){
            if(st.charAt(i) == '*'){
                scount++;
            }else if(st.charAt(i) == '#'){
                hcount++;
            }
        }
        if(hcount == scount){
            System.out.println("Both are Equal: 0");
        }else if(hcount > scount){
            System.out.println("Count of #'s is more than Count of *'s : " + (scount - hcount));
        }else{
            System.out.println("Count of *'s is more than Count of *'# : " + (scount - hcount));
        }
    }
}
