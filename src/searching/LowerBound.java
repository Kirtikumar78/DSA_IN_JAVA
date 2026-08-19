package searching;

import java.util.Scanner;

public class LowerBound {
    public static int lowerBound(int arr[], int target){
        int low=0;
        int high=arr.length-1;
        int ans= arr.length;
        while(low<=high){
            int mid =(low +high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;

            }
            else{
                low =mid+1;

            }

        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target= sc.nextInt();
        int i = lowerBound(arr, target);
        System.out.println(i);

    }
}
