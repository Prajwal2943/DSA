package sorting.practiceque;

public class insertionsort {

    public static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }
    public static void printarray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        insertionSort(arr);
        printarray(arr);
    }
}
