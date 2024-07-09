package array;

public class printsubarraysum {
    public static void subarray(int numbers[]) {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++) {
                int end = j;
                int currSum=0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Maximum Sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subarray(numbers);

    }
}
