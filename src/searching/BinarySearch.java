package searching;

public class BinarySearch {
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target){
                start=mid+1;
            }
            else
                end=mid-1;

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,6,7,8,9,9,10,10,10};
        int target=6;
        int i = binarySearch(arr, target);
        System.out.println(i);

    }
}
