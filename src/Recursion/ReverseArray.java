package Recursion;

public class ReverseArray {
    public static void reverseArray(int arr[],int l,int h){
        if(l>=h){
            return ;
        }

        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
        reverseArray(arr,l+1,h-1);  

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int low=0;
        int high= arr.length-1;
        reverseArray(arr,low,high);
        for(int num : arr){
            System.out.println(num);
        }

    }
}
