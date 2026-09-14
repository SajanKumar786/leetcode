class Solution {
    public int majorityElement(int[] nums) {
        int currCount=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(currCount==0){
                maxCount=nums[i];
            }
            if(maxCount==nums[i]){
                currCount++;
            }
            else{
                currCount--;
            }
        }
        return maxCount;
    }
}