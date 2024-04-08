import java.util.Scanner;

public class PathMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no.of cols: ");
        int cols = sc.nextInt();

        int mat[][] = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                if(i == 0 || j == 0) mat[i][j] = 1;
                else{
                    mat[i][j] = mat[i-1][j] + mat[i][j-1];
                }
                
            }

        }

        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");

        }

        int k=5;
        int m= ++k;
        int n = k++;
        System.out.println(m);
        System.out.println(n);
        System.out.println(k);



    }
}


