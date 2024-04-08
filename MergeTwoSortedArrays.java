import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1: ");
        int arrsize1 = sc.nextInt();
        System.out.print("Enter the size of array2: ");
        int arrsize2 = sc.nextInt();

        int arr1[] = new int[arrsize1];
        int arr2[] = new int[arrsize2];
        int total[] = new int[arrsize1+arrsize2];

        for(int i=0;i<arrsize1;i++){
            System.out.print("Enter the " + i + "th element of array1 : ");
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<arrsize2;i++){
            System.out.print("Enter the " + i + "th element of array2 : ");
            arr2[i] = sc.nextInt();
        }

        int i=0,j=0,k=0;

        while(i < arrsize1 && j < arrsize2){
            if(arr1[i] < arr2[j]){
                total[k] = arr1[i];
                i++; 
            }
            else{ //if(arr1[i] > arr2[j])
                total[k] = arr2[j];
                j++; 
            }
            k++;
        }
        while(i < arrsize1){
            total[k] = arr1[i];
            k++;
            i++;
        }
        while(j < arrsize2){
            total[k] = arr2[j];
            k++;
            j++;
        }

        System.out.print("The sorted and merged array is: ");
        for(int ele: total){
            System.out.print(ele + " ");

        }


        
    }
}
