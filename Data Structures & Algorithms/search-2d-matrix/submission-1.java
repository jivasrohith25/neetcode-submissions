class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int cols=matrix[0].length;

        int low=0;
        int high=row*cols-1;

        while(low<=high){

            int mid=low+(high-low)/2;

            int rows=mid/cols;
            int col=mid%cols;

            if(matrix[rows][col]==target){
                return true;
            }
            else if(matrix[rows][col]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }


        }

        return false;
        
    }
}
