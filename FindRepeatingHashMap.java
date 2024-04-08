import java.util.*;

public class FindRepeatingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hmap = new HashMap<>();

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            hmap.put(temp,hmap.getOrDefault(temp, 0) + 1);
        }

        for(int x : hmap.keySet()){
            if(hmap.get(x) > 1) System.out.println("key : " + x + " value : " + hmap.get(x));
        }

    }
}
