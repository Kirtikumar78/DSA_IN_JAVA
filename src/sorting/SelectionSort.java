package sorting;

public class SelectionSort {
    public static int[] selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){

            int minIndex=i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int arr[]={2,4,7,5,3,5,8,9,6,4};
        int brr[]=selectionSort(arr);
        for(int num: brr){
            System.out.println(num);
        }
    }
}
