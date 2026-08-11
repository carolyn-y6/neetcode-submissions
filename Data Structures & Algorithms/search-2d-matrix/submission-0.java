class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int lowWid = 0;
        // int highWid = matrix[0].length;
        // int lowHeight = 0;
        // int highHeight = matrix.length;
        int low = 0;
        int high = (matrix[0].length * matrix.length) - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int len = mid % matrix[0].length;
            int height = mid / matrix[0].length; 

            if(matrix[height][len] == target){
                return true;
            }

            if(matrix[height][len] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
