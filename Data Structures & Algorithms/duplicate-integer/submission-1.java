class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> a=new HashSet<>();

        for(int b:nums){
            if(a.contains(b)){
                return true;
            }
            else{
                a.add(b);
            }
            
            
            
        }

        return false;
        
    }
}