import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeftRotateCollections {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n= sc.nextInt();
        List<Integer> l = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            l.add(sc.nextInt());
        }
        System.out.print("Enter the no.of rotating: ");
        int d = sc.nextInt();
        System.out.print("Before Rotating: ");
        for(int i: l){
            System.out.print(i + " ");
        }

        Collections.rotate(l, -d);

        System.out.print("\nAfter Rotating: ");
        for(int i: l){
            System.out.print(i + " ");
        }

        
    }
}
