class Solution {
    public int longestConsecutive(int[] nums) {
        int n,c=0;
        if(nums.length==0){
            return c;
        }
        Arrays.sort(nums);
        for(int i=0,j=1;j<nums.length;i++,j++){
            int a=nums[i];
            int b=nums[j];
            if(a<0){
                a=a*-1;
            }
            if(b<0){
                b=b*-1;
            }
            if(b-a==1){
                c+=1;
            }
        }
        return c+1;
    }
}
