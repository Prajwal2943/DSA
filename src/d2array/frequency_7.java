package d2array;

public class frequency_7 {
    public static int frequency(int nums[][],int key) {
        int freq=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++)
                if(nums[i][j]==key){
                    freq++;
                }
        }
    return freq;
    }

    public static void main(String[] args) {
        int nums[][]={{4,7,8}, {8,8,7}};
        int key=8;
        System.out.println(frequency(nums,key));

    }
}
