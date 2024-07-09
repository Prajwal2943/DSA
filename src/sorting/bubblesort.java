package sorting;

public class bubblesort {
    public static void bubbleSort(int numbers[]) {
        int n=numbers.length;
        System.out.println("Array before sorting ");
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
        int temp=0;
        System.out.println("\nAfter sorting : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;

                }
                System.out.println();
                for(int k=0;k<n;k++){
                    System.out.print(numbers[k]+" ");
                }

            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }

    }
    public static void main(String[] args) {
        int numbers[]={2,6,1,3,8,5};
        bubbleSort(numbers);

    }
}
