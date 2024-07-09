package d2array;

public class sumofrow {
    public static void sumofRows(int nums[][]) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];
            }
            System.out.println("the sum of " + i+ "row is : "+sum);
            sum=0;
        }


    }
    public static void main(String[] args) {
        int nums[][]={{1,4,9},{11,4,3},{2,2,3}};

        sumofRows(nums);

    }
}
