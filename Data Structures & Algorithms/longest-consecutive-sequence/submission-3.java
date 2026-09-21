class Solution {
    public int longestConsecutive(int[] nums) {
        int n,c=1;
        System.out.println(c);
        Arrays.sort(nums);
        for(int i=0,j=1;j<nums.length;i++,j++){
            int a=nums[i];
            int b=nums[j];
            if(b-a==1){
                c+=1;
            }
        }
        return c;
    }
}
