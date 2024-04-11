import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int  n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            if(l.contains(temp)) {
                System.out.println("First Repeating element is " + temp);
                return ;
            }
            l.add(temp);
        }
        System.out.println("No Repeating elements found");
    }
}
