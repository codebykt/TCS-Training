import java.util.*;

class CombineWires{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter N val: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            pq.add(sc.nextInt());
        }
        int total = 0;



        while (pq.size() > 1) {
            int temp = 0;
            temp = pq.remove() + pq.remove();
            pq.add(temp);
            total += temp;
            // System.out.println("total: " + total);
            
            
        }
        System.out.println("Total: " + total);
        
    }
}

//768611