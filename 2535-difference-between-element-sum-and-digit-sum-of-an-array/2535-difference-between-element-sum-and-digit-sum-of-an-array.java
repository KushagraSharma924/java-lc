class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum = 0;
        int digisum = 0;

        for(int i = 0; i< nums.length;i++){
            
            sum += nums[i];
             int num = nums[i];

            while(num > 0){
                digisum += num % 10;
                num /= 10;
            }
        }
        return Math.abs(sum - digisum);
    }
}