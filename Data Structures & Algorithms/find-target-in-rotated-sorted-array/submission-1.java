class Solution {
    public int search(int[] nums, int target) {

        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
            if(a.contains(target)){
                return i;
            }
        


        }
        return -1;
        
    }
}
