package array;

public class printsubarrays {
    public static void printsubarray(int numbers[]) {
        int totalsubarrays=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");

                }
                totalsubarrays++;
                System.out.println(" ");
            }

        }
        System.out.println("Total sub arrays : "+totalsubarrays);

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printsubarray(numbers);
        
    }
}
