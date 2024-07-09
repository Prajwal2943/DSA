package sorting;

public class selectionsort {
    public static void selectionSort(int numbers[]) {
        for(int i=0;i<numbers.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[minPos] > numbers[j]){
                    minPos=j;
                }

            }
            //swap
            int temp=numbers[minPos];
            numbers[minPos]=numbers[i];
            numbers[i]=temp;
            System.out.println();
            for (int k = 0; k < numbers.length; k++) {
                System.out.print(numbers[k] + " ");
            }

        }

    }
    public static void printArray(int numbers[]) {
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int numbers[]={5,4,8,2,1};
        selectionSort(numbers);
        printArray(numbers);

    }
}
