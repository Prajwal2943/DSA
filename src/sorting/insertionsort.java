package sorting;

public class insertionsort {
    public static void insertionSort(int numbers[]) {
        int n=numbers.length;
        for(int curr=1;curr<n;curr++){
            int key=numbers[curr];
            int prev=curr-1;
            while(prev>=0 && numbers[prev]>key){
                numbers[prev+1]=numbers[prev];
                prev--;
            }
            numbers[prev+1]=key;
        }

    }

    public static void printArray(int numbers[]) {
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

    }
    public static void main(String[] args) {
        int numbers[]={5,3,4,1,2};
        insertionSort(numbers);
        printArray(numbers);
    }

}
