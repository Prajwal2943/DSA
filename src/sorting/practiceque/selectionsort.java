package sorting.practiceque;

public class selectionsort {
    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int maxPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxPos]<arr[j]){
                    maxPos=j;
                }
            }
            //swapping
            int temp=arr[maxPos];
            arr[maxPos]=arr[i];
            arr[i]=temp;

        }

    }
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr);
        printArray(arr);
    }
}
